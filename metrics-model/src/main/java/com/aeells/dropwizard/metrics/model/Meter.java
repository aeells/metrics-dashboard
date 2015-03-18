package com.aeells.dropwizard.metrics.model;

import lombok.Data;

@Data
public final class Meter
{
    private int count;

    private double m15_rate;

    private double m1_rate;

    private double m5_rate;

    private double mean_rate;

    private String units;
}
