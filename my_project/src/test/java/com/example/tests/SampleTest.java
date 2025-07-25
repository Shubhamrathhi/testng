package com.example.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SampleTest {

    @Test
    public void testSum() {
        int a = 2;
        int b = 3;
        int expected = 5;
        assertEquals(a + b, expected, "Sum should be 5");
    }

    @Test
    public void testDifference() {
        int x = 10;
        int y = 4;
        assertEquals(x - y, 6, "Difference should be 6");
    }
}
