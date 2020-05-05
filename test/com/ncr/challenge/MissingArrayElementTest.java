package com.ncr.challenge;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MissingArrayElementTest {

    @Test
    void testFindMissingElement() {
        int[] mainArray = {4, 1, 0, 2, 9, 6, 8, 6, 7, 5, 3};
        int[] testArray = {6, 4, 7, 2, 1, 0, 8, 3, 6, 9};

        Optional<Integer> missingElement = MissingArrayElement.findMissingElement(mainArray, testArray);

        assertTrue(missingElement.isPresent());
        assertEquals(5, missingElement.get());
    }

    @Test
    void testFindAnotherMissingElement() {
        int[] mainArray = {8, 6, 7, 5, 3, 0, 9};
        int[] testArray = {6, 3, 5, 7, 8, 9};

        Optional<Integer> jenny = MissingArrayElement.findMissingElement(mainArray, testArray);

        assertTrue(jenny.isPresent());
        assertEquals(0, jenny.get());
    }

    @Test
    void testNoElementsMissing() {
        int[] mainArray = {8, 6, 7, 5, 3, 0, 9};
        int[] testArray = {6, 3, 5, 7, 8, 9, 0};

        Optional<Integer> jenny = MissingArrayElement.findMissingElement(mainArray, testArray);

        assertTrue(jenny.isEmpty());
    }
}
