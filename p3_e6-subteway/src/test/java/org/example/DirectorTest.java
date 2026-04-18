package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectorTest {
    private Director director;
    private ClassicBuilder classicBuilder;
    private VegetarianBuilder vegetarianBuilder;

    @BeforeEach
    public void setUp() {
        classicBuilder = new ClassicBuilder();
        vegetarianBuilder = new VegetarianBuilder();
        director = new Director(classicBuilder);
    }

    @Test
    public void testChangeBuilderNoMixedSandwiches() {
        // Build a classic sandwich
        director.make();
        assertEquals(500.0, classicBuilder.getResult(), 0.001);

        // Change the builder to Vegetarian and build
        director.setBuilder(vegetarianBuilder);
        director.make();
        
        // Ensure the vegetarian sandwich has the correct value and no state was mixed from the previous build
        assertEquals(420.0, vegetarianBuilder.getResult(), 0.001);

        // Ensure the classic builder state wasn't affected after being swapped out
        assertEquals(500.0, classicBuilder.getResult(), 0.001);
    }
}
