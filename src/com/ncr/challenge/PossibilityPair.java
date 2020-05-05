package com.ncr.challenge;

import java.util.Arrays;

public class PossibilityPair {
    private final int[] numPair;

    public PossibilityPair(int[] numPair) {
        this.numPair = numPair;
        Arrays.sort(this.numPair);
    }

    public int[] getNumPair() {
        return numPair;
    }

    public int getSum() {
        return numPair[0] + numPair[1];
    }
}
