package com.aeells.dropwizard.metrics.model;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

@Data
public final class Metrics
{
    private String version;

    private Map<String, Gauge> gauges;

    private Map<String, Counter> counters;

    private Map<String, Histogram> histograms;

    private Map<String, Meter> meters;

    private Map<String, Timer> timers;

    public void doSomethingAroundVersionValidation() // can we use Dropwizard validation API ?
    {
        if (!StringUtils.equals(version, "3.0.0"))
        {
            throw new IllegalStateException("this Metrics model is for version 3.0.0.");
        }
    }
}
