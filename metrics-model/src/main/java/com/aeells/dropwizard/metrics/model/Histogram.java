package com.aeells.dropwizard.metrics.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public final class Histogram
{
    //todo don't know what this looks like yet...

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
        return ReflectionToStringBuilder.toString(this);
    }
}
