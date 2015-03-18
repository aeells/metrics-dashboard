package com.aeells.dropwizard.metrics.model;

import lombok.Data;

@Data
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
}
