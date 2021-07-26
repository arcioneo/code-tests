package com;

import java.util.ArrayList;
import java.util.List;

public class AmazonFleet {

    public List<Integer> chooseFleets(List<Integer> wheels) {
        List<Integer> results = new ArrayList<>();

        wheels.stream().forEach(i -> {
            results.add(i % 2 != 0 ? 0 : (i / 4) + 1);
        });

        return results;
    }
}
