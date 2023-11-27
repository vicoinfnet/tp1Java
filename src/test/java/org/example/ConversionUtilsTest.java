package org.example;
import ConversionUtils.ConversionUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversionUtilsTest {

    @Test
    void testKmToMiles() {
        assertEquals(0.621371, ConversionUtils.kmToMiles(1), 0.000001, "1 km deve ser igual a 0,621371 milhas");
    }

    @Test
    void testKmToMeters() {
        assertEquals(1000, ConversionUtils.kmToMeters(1), "1 km deve ser igual a 1000 metros");
    }

    @Test
    void testKmToCentimeters() {
        assertEquals(100000, ConversionUtils.kmToCentimeters(1), "1 km deve ser igual a 100000 centimetros");
    }

    @Test
    void testKmToMilesWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> ConversionUtils.kmToMiles(-1), "O valor do quilômetro não pode ser negativo");
    }


}
