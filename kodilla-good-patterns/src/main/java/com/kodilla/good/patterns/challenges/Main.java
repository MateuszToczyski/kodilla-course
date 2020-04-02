package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String... args) {

        MovieStore store = new MovieStore();

        Map<String, List<String>> movieMap = store.getMovies();

        StringBuilder output = new StringBuilder();

        movieMap.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(title -> {
                    output.append(title).append(" ! ");
                });

        System.out.println(output.toString());
    }
}
