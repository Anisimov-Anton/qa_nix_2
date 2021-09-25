package org.example.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Venus implements Planet {

    private final BigDecimal weight;
    private final BigDecimal radius;

    public Venus() {
        this.weight = BigDecimal.valueOf(4.867E24);
        this.radius = BigDecimal.valueOf(6051.8);
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " weight(kg) = " + getWeight() +
                ", diameter(km) = " + getRadius().multiply(BigDecimal.valueOf(2));
    }

    @Override
    public BigDecimal getAccelerationOfGravity() {
        BigDecimal accelerationOfGravity = (G.multiply(getWeight())).divide(getRadius().pow(2), 1,
                RoundingMode.HALF_DOWN);
        return accelerationOfGravity;
    }
}
