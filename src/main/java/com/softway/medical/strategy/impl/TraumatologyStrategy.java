package com.softway.medical.strategy.impl;

import com.softway.medical.strategy.PathologyStrategy;

public class TraumatologyStrategy implements PathologyStrategy {
    @Override
    public boolean appliesTo(int healthIndex) {
        return healthIndex % 5 == 0;
    }

    @Override
    public String getMedicalUnit() {
        return "Traumatologie";
    }
}
