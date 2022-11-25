package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void pesosToDollars() {
        App app = new App();
        assertTrue(app.pesosToDollars(20) == 1);
    }

    @Test
    public void dollarsToYen() {
        App app = new App();
        assertTrue(app.dollarsToYen(1) == 100);
    }

    @Test
    public void pesoToCanadianDollar() {
        App app = new App();
        assertTrue(app.pesoToCanadianDollar(20) == 3);
    }

    // Asserts false
    @Test
    public void pesoToCanadianDollar2() {
        App app = new App();
        assertFalse(app.pesoToCanadianDollar(20) == 4);
    }

    @Test
    public void pesoToCanadianDollar3() {
        App app = new App();
        assertFalse(app.pesoToCanadianDollar(20) == 5);
    }

    @Test
    public void pesoToCanadianDollar4() {
        App app = new App();
        assertFalse(app.pesoToCanadianDollar(20) == 6);
    }

}
