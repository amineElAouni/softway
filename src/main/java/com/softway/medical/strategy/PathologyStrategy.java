package com.softway.medical.strategy;

public interface PathologyStrategy {
    boolean appliesTo(int healthIndex);
    String getMedicalUnit();
}
