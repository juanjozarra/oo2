package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VegetarianTest {
    private VegetarianBuilder builder;
    private Director director;

    @BeforeEach
    public void setUp() {
        builder = new VegetarianBuilder();
        director = new Director(builder);
    }

    @Test
    public void testBuildSandwich() {
        director.make();
        assertEquals(420.0, builder.getResult(), 0.001);
    }

    @Test
    public void testNoMixedSandwiches() {
        director.make();
        assertEquals(420.0, builder.getResult(), 0.001);
        
        // Making another sandwich with the same builder should reset the result, preventing mixed state
        director.make();
        assertEquals(420.0, builder.getResult(), 0.001);
    }
}
