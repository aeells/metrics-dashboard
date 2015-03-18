package com.aeells.dropwizard.metrics.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Map;

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

    public String getVersion()
    {
        return version;
    }

    public void setVersion(final String version)
    {
        this.version = version;
    }

    public Map<String, Gauge> getGauges()
    {
        return gauges;
    }

    public void setGauges(final Map<String, Gauge> gauges)
    {
        this.gauges = gauges;
    }

    public Map<String, Counter> getCounters()
    {
        return counters;
    }

    public void setCounters(final Map<String, Counter> counters)
    {
        this.counters = counters;
    }

    public Map<String, Histogram> getHistograms()
    {
        return histograms;
    }

    public void setHistograms(final Map<String, Histogram> histograms)
    {
        this.histograms = histograms;
    }

    public Map<String, Meter> getMeters()
    {
        return meters;
    }

    public void setMeters(final Map<String, Meter> meters)
    {
        this.meters = meters;
    }

    public Map<String, Timer> getTimers()
    {
        return timers;
    }

    public void setTimers(final Map<String, Timer> timers)
    {
        this.timers = timers;
    }

    @Override
    public int hashCode()
    {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(final Object obj)
    {
        return EqualsBuilder.reflectionEquals(obj, this);
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
