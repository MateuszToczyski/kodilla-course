package com.kodilla.stream.array;

import java.util.Arrays;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .orElseThrow(IllegalArgumentException::new);
    }
}
