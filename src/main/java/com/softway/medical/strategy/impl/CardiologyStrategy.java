package com.softway.medical.strategy.impl;

import com.softway.medical.strategy.PathologyStrategy;

public class CardiologyStrategy implements PathologyStrategy {
    @Override
    public boolean appliesTo(int healthIndex) {
        return healthIndex % 3 == 0;
    }

    @Override
    public String getMedicalUnit() {
        return "Cardiologie";
    }
}
