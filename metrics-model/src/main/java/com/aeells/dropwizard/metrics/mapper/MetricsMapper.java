package com.aeells.dropwizard.metrics.mapper;

import com.aeells.dropwizard.metrics.model.Metrics;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;

public final class MetricsMapper
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MetricsMapper.class);

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public Metrics map(final URL resource) // todo aeells - signature will likely change...
    {
        try
        {
            return MAPPER.readValue(resource, Metrics.Builder.class).build();
        }
        catch (final IOException e)
        {
            LOGGER.error("unable to map resource: " + resource, e);
            throw new IllegalArgumentException("unable to map resource: " + resource, e);
        }
    }
}
