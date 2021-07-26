package com;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class SearchSuggestions {

    public static final int LIMIT = 3;

    public List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        return repository == null || repository.size() == 0 || customerQuery == null || customerQuery.length() < 2
                ? new ArrayList<>()
                : getSuggestion(repository, customerQuery);
    }

    private List<List<String>> getSuggestion(List<String> repository, String query) {
        List<List<String>> suggestions = new ArrayList<>();
        List<String> coincidences;

        Collections.sort(repository);
        query = query.toLowerCase(Locale.ROOT);

        for (int i = 1; i < query.length(); i++) {
            final String substring = query.substring(0, i + 1);
            coincidences = repository.stream().filter(r -> r.toLowerCase(Locale.ROOT).startsWith(substring)).collect(toList());
            if(coincidences.isEmpty()) {continue;}
            coincidences = coincidences.size() > LIMIT ? limitResult(coincidences, LIMIT) : coincidences;
            suggestions.add(coincidences);
        }

        return suggestions;
    }

    private List<String> limitResult(List<String> values, int n) {
        return values.subList(0, n);
    }
}
