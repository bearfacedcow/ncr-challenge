package com.ncr.challenge;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {4, 1, 0, 2, 9, 6, 8, 6, 7, 5, 3};
        int[] arr2 = {6, 4, 7, 2, 1, 0, 8, 3, 6, 9};

        Optional<Integer> missingElement = MissingArrayElement.findMissingElement(arr1, arr2);
        if (missingElement.isPresent()) {
            System.out.printf("Missing element is %d\n", missingElement.get());
        } else {
            System.out.println("No elements missing\n");
        }

        PossibilityGenerator possibilityGenerator = new PossibilityGenerator(arr1);
        possibilityGenerator.getPairsForSum(4).forEach(ints -> System.out.printf("(%d, %d)\n", ints[0], ints[1]));
    }
}
