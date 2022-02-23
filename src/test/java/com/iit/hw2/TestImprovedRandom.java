package com.iit.hw2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestImprovedRandom {

    ImprovedRandom improvedRandom;

    @Before
    public void setUp() {
        improvedRandom = new ImprovedRandom();
        improvedRandom = new ImprovedRandom(10);
    }

    @Test
    public void testRandomBetween() {
        int result = improvedRandom.randomBetween(5, 7);
        Assert.assertTrue(5 <= result && result < 7);
    }

    @Test
    public void testRandomSame() {
        int result = improvedRandom.randomBetween(4, 4);
        Assert.assertTrue(4 <= result);
    }

    @Test
    public void testRandomConsecutive() {
        int result = improvedRandom.randomBetween(11, 12);
        Assert.assertTrue(11 <= result && result < 12);
    }

    @Test
    public void testRandomZero() {
        int result = improvedRandom.randomBetween(0, 1);
        Assert.assertTrue(0 == result && result < 1);
    }

    @Test
    public void testRandomBetween2() {
        int result = improvedRandom.randomBetween(1, 20);
        Assert.assertTrue(1 <= result && result < 20);
    }

    @Test
    public void testRandomBetween3() {
        int result = improvedRandom.randomBetween(5, 10);
        Assert.assertTrue(5 <= result && result < 10);
    }
}
