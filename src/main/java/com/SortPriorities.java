package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortPriorities {

    public List<Integer> reassignedPriorities(List<Integer> priorities) {
        List<Integer> reassignedPriorities = new ArrayList<>();
        Map<Integer, Integer> differentNumbers = new TreeMap<>();
        Map<Integer, Integer> assignedValues = new HashMap<>();

        for (int i = 0; i < priorities.size(); i++) {
            differentNumbers.put(priorities.get(i), priorities.get(i));
        }

        int counter = 1;
        for (Map.Entry<Integer, Integer> entry : differentNumbers.entrySet()) {
            assignedValues.put(entry.getKey(), counter++);
        }

        priorities.stream().forEach(p -> {
            reassignedPriorities.add(assignedValues.get(p));
        });

        System.out.println(reassignedPriorities);
        return reassignedPriorities;
    }
}
