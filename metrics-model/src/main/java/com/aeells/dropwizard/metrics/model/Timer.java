package com.aeells.dropwizard.metrics.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public final class Timer
{
    private int count;

    private double max;

    private double mean;

    private double min;

    private double p50;

    private double p75;

    private double p95;

    private double p98;

    private double p99;

    private double p999;

    private double stddev;

    private double m15_rate;

    private double m1_rate;

    private double m5_rate;

    private double mean_rate;

    private String duration_units;

    private String rate_units;

    public int getCount()
    {
        return count;
    }

    public void setCount(final int count)
    {
        this.count = count;
    }

    public double getMax()
    {
        return max;
    }

    public void setMax(final double max)
    {
        this.max = max;
    }

    public double getMean()
    {
        return mean;
    }

    public void setMean(final double mean)
    {
        this.mean = mean;
    }

    public double getMin()
    {
        return min;
    }

    public void setMin(final double min)
    {
        this.min = min;
    }

    public double getP50()
    {
        return p50;
    }

    public void setP50(final double p50)
    {
        this.p50 = p50;
    }

    public double getP75()
    {
        return p75;
    }

    public void setP75(final double p75)
    {
        this.p75 = p75;
    }

    public double getP95()
    {
        return p95;
    }

    public void setP95(final double p95)
    {
        this.p95 = p95;
    }

    public double getP98()
    {
        return p98;
    }

    public void setP98(final double p98)
    {
        this.p98 = p98;
    }

    public double getP99()
    {
        return p99;
    }

    public void setP99(final double p99)
    {
        this.p99 = p99;
    }

    public double getP999()
    {
        return p999;
    }

    public void setP999(final double p999)
    {
        this.p999 = p999;
    }

    public double getStddev()
    {
        return stddev;
    }

    public void setStddev(final double stddev)
    {
        this.stddev = stddev;
    }

    public double getM15_rate()
    {
        return m15_rate;
    }

    public void setM15_rate(final double m15_rate)
    {
        this.m15_rate = m15_rate;
    }

    public double getM1_rate()
    {
        return m1_rate;
    }

    public void setM1_rate(final double m1_rate)
    {
        this.m1_rate = m1_rate;
    }

    public double getM5_rate()
    {
        return m5_rate;
    }

    public void setM5_rate(final double m5_rate)
    {
        this.m5_rate = m5_rate;
    }

    public double getMean_rate()
    {
        return mean_rate;
    }

    public void setMean_rate(final double mean_rate)
    {
        this.mean_rate = mean_rate;
    }

    public String getDuration_units()
    {
        return duration_units;
    }

    public void setDuration_units(final String duration_units)
    {
        this.duration_units = duration_units;
    }

    public String getRate_units()
    {
        return rate_units;
    }

    public void setRate_units(final String rate_units)
    {
        this.rate_units = rate_units;
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
