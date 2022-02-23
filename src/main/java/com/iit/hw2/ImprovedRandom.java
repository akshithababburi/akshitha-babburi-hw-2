package com.iit.hw2;

import java.util.Random;

public class ImprovedRandom extends Random {
    public ImprovedRandom() {
    }

    public ImprovedRandom(long seed) {
        super(seed);
    }

    public int randomBetween(int min, int max) {
        int result = nextInt(max);
        if (result > min && result < max) {
            return result;
        }
        if (result < min) {
            if ((min + result) == max || (min + result) > min)
                return min;
            else
                return min + result;
        }
        if (min == result) {
            return result;
        }
        return result;
    }
}
