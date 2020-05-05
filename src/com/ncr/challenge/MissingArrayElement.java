package com.ncr.challenge;

import java.util.Arrays;
import java.util.Optional;

public class MissingArrayElement {
    public static Optional<Integer> findMissingElement(int[] arrayWithAllElements, int[] arrayWithMissingElement) {
        Arrays.sort(arrayWithAllElements);
        Arrays.sort(arrayWithMissingElement);

        for (int i = 0; i < arrayWithAllElements.length; i++) {
            if (arrayWithAllElements[i] != arrayWithMissingElement[i]) {
                return Optional.of(arrayWithAllElements[i]); // here's our missing element
            }
        }

        return Optional.ofNullable(null); // all elements are present
    }
}
