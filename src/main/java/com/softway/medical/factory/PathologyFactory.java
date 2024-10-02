package com.softway.medical.factory;

import com.softway.medical.strategy.PathologyStrategy;
import com.softway.medical.strategy.impl.CardiologyStrategy;
import com.softway.medical.strategy.impl.TraumatologyStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PathologyFactory {
    private static final List<PathologyStrategy> strategies;

    static {
        strategies = new ArrayList<>();
        strategies.add(new CardiologyStrategy());
        strategies.add(new TraumatologyStrategy());
    }

    public static List<PathologyStrategy> getApplicableStrategies(int healthIndex) {
        return strategies.stream()
                .filter(strategy -> strategy.appliesTo(healthIndex))
                .collect(Collectors.toList());
    }
}
