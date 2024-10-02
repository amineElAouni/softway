package com.softway.medical;

import com.softway.medical.factory.PathologyFactory;
import com.softway.medical.strategy.PathologyStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class AutoDiagnosticSystem {
    public static String getMedicalUnits(int healthIndex) {

        List<PathologyStrategy> applicableStrategies = PathologyFactory.getApplicableStrategies(healthIndex);

        if (applicableStrategies.isEmpty()) {
            return "Aucune pathologie détectée";
        }

        return applicableStrategies.stream()
                .map(PathologyStrategy::getMedicalUnit)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        int healthIndex = 15;
        String result = getMedicalUnits(healthIndex);
        System.out.println("Unité(s) médicale(s) : " + result);
    }
}