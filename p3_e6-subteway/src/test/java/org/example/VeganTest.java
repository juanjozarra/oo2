package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeganTest {
    private VeganBuilder builder;
    private Director director;

    @BeforeEach
    public void setUp() {
        builder = new VeganBuilder();
        director = new Director(builder);
    }

    @Test
    public void testBuildSandwich() {
        director.make();
        assertEquals(620.0, builder.getResult(), 0.001);
    }

    @Test
    public void testNoMixedSandwiches() {
        director.make();
        assertEquals(620.0, builder.getResult(), 0.001);
        
        // Making another sandwich with the same builder should reset the result, preventing mixed state
        director.make();
        assertEquals(620.0, builder.getResult(), 0.001);
    }
}
