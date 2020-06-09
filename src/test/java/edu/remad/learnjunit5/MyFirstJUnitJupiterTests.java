package edu.remad.learnjunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * This is are unit tests for {@link Calculator} for learning JUnit5.
 */
public class MyFirstJUnitJupiterTests {

    @Test
    @DisplayName("Addition of 1 + 1 equals 2 Test")
    public void additionTest() {
        assertEquals(2, Calculator.add(1,1));
    }
}
