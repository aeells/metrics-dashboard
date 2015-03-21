package com.aeells.dropwizard.metrics.mapper;

import com.aeells.dropwizard.metrics.model.Counter;
import com.aeells.dropwizard.metrics.model.Gauge;
import com.aeells.dropwizard.metrics.model.Histogram;
import com.aeells.dropwizard.metrics.model.Meter;
import com.aeells.dropwizard.metrics.model.Metrics;
import com.aeells.dropwizard.metrics.model.Timer;
import com.google.common.io.Resources;
import org.junit.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public final class MetricsMapperTest
{
    @Test
    public void deserializeFromJson() throws Exception
    {
        final Metrics.Builder builder = new Metrics.Builder();
        builder.setVersion("3.0.0");
        builder.setGauges(new HashMap<String, Gauge>()
        {
            {
                final Gauge vendor = new Gauge();
                vendor.setValue("Oracle Corporation Java HotSpot(TM) 64-Bit Server VM 24.60-b09 (1.7)");
                this.put("jvm.attribute.vendor", vendor);

                final Gauge threads = new Gauge();
                threads.setValue(61);
                this.put("jvm.threads.count", threads);
            }
        });
        builder.setCounters(new HashMap<String, Counter>()
        {
            {
                final Counter counter = new Counter();
                this.put("io.dropwizard.jetty.MutableServletContextHandler.active-requests", counter);
            }
        });
        builder.setHistograms(new HashMap<String, Histogram>());
        builder.setMeters(new HashMap<String, Meter>()
        {
            {
                final Meter meter = new Meter();
                meter.setCount(0);
                meter.setM15_rate(0);
                meter.setM1_rate(0);
                meter.setM5_rate(0);
                meter.setMean_rate(0);
                meter.setUnits("events/second");
                this.put("io.dropwizard.jetty.MutableServletContextHandler.4xx-responses", meter);
            }
        });
        builder.setTimers(new HashMap<String, Timer>()
        {
            {
                final Timer timer = new Timer();
                timer.setDuration_units("seconds");
                timer.setRate_units("calls/second");
                this.put("com.example.helloworld.resources.HelloWorldResource.get-requests", timer);
            }
        });

        final Metrics metrics = builder
            .build();

        assertThat(new MetricsMapper().map(Resources.getResource("fixtures/metrics.json"))).isEqualTo(metrics);
    }
}
