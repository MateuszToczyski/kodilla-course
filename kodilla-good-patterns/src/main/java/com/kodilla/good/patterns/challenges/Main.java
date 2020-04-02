package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String... args) {

        MovieStore store = new MovieStore();

        Map<String, List<String>> movieMap = store.getMovies();

        movieMap.values().stream()
                .flatMap(Collection::stream)
                .forEach(title -> {
                    System.out.print(title);
                    System.out.print(" ! ");
                });
    }
}
