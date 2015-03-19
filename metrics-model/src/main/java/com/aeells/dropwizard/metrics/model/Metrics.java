package com.aeells.dropwizard.metrics.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Map;
import java.util.Set;

@Getter @Setter @EqualsAndHashCode @ToString
public final class Metrics
{
    private static final Validator VALIDATOR = Validation.byProvider(HibernateValidator.class)
        .configure()
        .ignoreXmlConfiguration()
        .buildValidatorFactory()
        .getValidator();

    @NotNull(message = "Version is required.")
    @Pattern(regexp = "3.0.0", message = "This Metrics model is for version 3.0.0.")
    private String version;

    private Map<String, Gauge> gauges;

    private Map<String, Counter> counters;

    private Map<String, Histogram> histograms;

    private Map<String, Meter> meters;

    private Map<String, Timer> timers;

    private Metrics(final Builder builder)
    {
        this.version = builder.version;
        this.gauges = builder.gauges;
        this.counters = builder.counters;
        this.histograms = builder.histograms;
        this.meters = builder.meters;
        this.timers = builder.timers;
    }

    @Getter @Setter @EqualsAndHashCode @ToString
    public static class Builder
    {
        private String version;

        private Map<String, Gauge> gauges;

        private Map<String, Counter> counters;

        private Map<String, Histogram> histograms;

        private Map<String, Meter> meters;

        private Map<String, Timer> timers;

        public Metrics build()
        {
            final Metrics metrics = new Metrics(this);

            final Set<ConstraintViolation<Metrics>> constraintViolations = VALIDATOR.validate(metrics);
            if (!constraintViolations.isEmpty())
            {
                throw new ConstraintViolationException("Invalid Metrics model.", constraintViolations);
            }

            return metrics;
        }
    }
}
