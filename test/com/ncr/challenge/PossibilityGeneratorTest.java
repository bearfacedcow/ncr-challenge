package com.ncr.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PossibilityGeneratorTest {

    private PossibilityGenerator possibilityGenerator;

    @BeforeEach
    void setUp() {
        int[] testNums = {1, 1, 2, 3, 4};
        possibilityGenerator = new PossibilityGenerator(testNums);
    }

    @Test
    void testInit() {
        assertNotNull(possibilityGenerator);
        assertTrue(possibilityGenerator.getPossibilities().size() > 0);
    }

    @Test
    void testPairForSum() {
        List<int[]> pairsForSum = possibilityGenerator.getPairsForSum(4);
        assertEquals(1, pairsForSum.size());

        int[] pair = pairsForSum.get(0);
        assertEquals(1, pair[0]);
        assertEquals(3, pair[1]);
    }

    @Test
    void testAnotherPair() {
        List<int[]> pairsForSum = possibilityGenerator.getPairsForSum(5);
        assertEquals(2, pairsForSum.size());
    }
}
