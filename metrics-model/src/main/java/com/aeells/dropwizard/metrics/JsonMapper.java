package com.aeells.dropwizard.metrics;

import com.aeells.dropwizard.metrics.model.Counter;
import com.aeells.dropwizard.metrics.model.Gauge;
import com.aeells.dropwizard.metrics.model.Histogram;
import com.aeells.dropwizard.metrics.model.Meter;
import com.aeells.dropwizard.metrics.model.Metrics;
import com.aeells.dropwizard.metrics.model.Timer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;

import java.io.IOException;
import java.util.Map;

public final class JsonMapper
{
    public static void main(final String[] args) throws IOException
    {
        final Metrics metrics = new ObjectMapper().readValue(Resources.getResource("metrics.json"), Metrics.Builder.class).build();

        System.out.println("*** version: " + metrics.getVersion());
        System.out.println("*** gauges: ");
        for (final Map.Entry<String, Gauge> entry : metrics.getGauges().entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("*** counters: ");
        for (final Map.Entry<String, Counter> entry : metrics.getCounters().entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("*** histograms: ");
        for (final Map.Entry<String, Histogram> entry : metrics.getHistograms().entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("*** meters: ");
        for (final Map.Entry<String, Meter> entry : metrics.getMeters().entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("*** timers: ");
        for (final Map.Entry<String, Timer> entry : metrics.getTimers().entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
