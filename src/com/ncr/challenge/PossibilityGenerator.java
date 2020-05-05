package com.ncr.challenge;

import java.util.*;
import java.util.stream.Collectors;

public class PossibilityGenerator {
    private final HashMap<String, PossibilityPair> possibilities;

    public PossibilityGenerator(int[] testPossibilities) {
        possibilities = new HashMap<>();

        for (int i = 0; i < testPossibilities.length; i++) {
            for (int j = 0; j < testPossibilities.length; j++) {
                if(i == j) continue;

                int[] pair = {testPossibilities[i], testPossibilities[j]};
                Arrays.sort(pair);

                possibilities.putIfAbsent(Arrays.toString(pair), new PossibilityPair(pair));
            }
        }
    }

    public Collection<PossibilityPair> getPossibilities() {
        return possibilities.values();
    }

    public List<int[]> getPairsForSum(int sum) {
        return possibilities.values().stream().filter(possibilityPair -> possibilityPair.getSum() == sum).map(PossibilityPair::getNumPair).collect(Collectors.toList());
    }

}
