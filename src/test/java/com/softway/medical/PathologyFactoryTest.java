package com.softway.medical;

import com.softway.medical.factory.PathologyFactory;
import com.softway.medical.strategy.PathologyStrategy;
import com.softway.medical.strategy.impl.CardiologyStrategy;
import com.softway.medical.strategy.impl.TraumatologyStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathologyFactoryTest {

    @Test
    void testCardiologyPathology() {
        int healthIndex = 33;
        List<PathologyStrategy> applicableStrategies = PathologyFactory.getApplicableStrategies(healthIndex);

        assertFalse(applicableStrategies.isEmpty(), "Cardiology should be applicable.");
        assertTrue(applicableStrategies.stream()
                        .anyMatch(strategy -> strategy instanceof CardiologyStrategy),
                "Cardiology should be in the result.");
        assertEquals(1, applicableStrategies.size(), "Only Cardiology should be applicable.");
    }

    @Test
    void testTraumatologyPathology() {
        int healthIndex = 55;
        List<PathologyStrategy> applicableStrategies = PathologyFactory.getApplicableStrategies(healthIndex);

        assertFalse(applicableStrategies.isEmpty(), "Traumatology should be applicable.");
        assertTrue(applicableStrategies.stream()
                        .anyMatch(strategy -> strategy instanceof TraumatologyStrategy),
                "Traumatology should be in the result.");
        assertEquals(1, applicableStrategies.size(), "Only Traumatology should be applicable.");
    }

    @Test
    void testCardiologyAndTraumatologyPathology() {
        int healthIndex = 15;
        List<PathologyStrategy> applicableStrategies = PathologyFactory.getApplicableStrategies(healthIndex);

        assertFalse(applicableStrategies.isEmpty(), "Cardiology and Traumatology should be applicable.");
        assertTrue(applicableStrategies.stream()
                        .anyMatch(strategy -> strategy instanceof CardiologyStrategy),
                "Cardiology should be in the result.");
        assertTrue(applicableStrategies.stream()
                        .anyMatch(strategy -> strategy instanceof TraumatologyStrategy),
                "Traumatology should be in the result.");
        assertEquals(2, applicableStrategies.size(), "Both Cardiology and Traumatology should be applicable.");
    }
}
