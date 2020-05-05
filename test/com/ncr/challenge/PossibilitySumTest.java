package com.ncr.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PossibilitySumTest {

    private PossibilityPair possibilitySum;

    @BeforeEach
    void setUp() {
        int[] testNums = {3, 1};
        possibilitySum = new PossibilityPair(testNums);
    }

    @Test
    void testInit() {
        assertNotNull(possibilitySum);
    }

    @Test
    void testSortedElements() {
        int[] pair = possibilitySum.getNumPair();
        assertEquals(1, pair[0]);
        assertEquals(3, pair[1]);
    }

    @Test
    void testSum() {
        assertEquals(4, possibilitySum.getSum());
    }
}
