package org.example.entity;

import java.math.BigDecimal;

public interface Planet {

    BigDecimal G = BigDecimal.valueOf(6.67E-11);
    BigDecimal getAccelerationOfGravity();
}
