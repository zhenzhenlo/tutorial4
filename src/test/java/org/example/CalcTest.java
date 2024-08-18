package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        // This test is designed to fail because 4 - 2 should be 2, but we will assert 3
        assertEquals(2, c.subtract(4, 2));
    }

}




