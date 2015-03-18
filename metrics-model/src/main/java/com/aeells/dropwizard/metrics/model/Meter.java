package com.aeells.dropwizard.metrics.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public final class Meter
{
    private int count;

    private double m15_rate;

    private double m1_rate;

    private double m5_rate;

    private double mean_rate;

    private String units;

    public int getCount()
    {
        return count;
    }

    public void setCount(final int count)
    {
        this.count = count;
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

    public String getUnits()
    {
        return units;
    }

    public void setUnits(final String units)
    {
        this.units = units;
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
