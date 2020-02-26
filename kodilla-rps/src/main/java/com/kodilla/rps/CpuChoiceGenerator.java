package com.kodilla.rps;

import java.util.Random;

public class CpuChoiceGenerator {
    public int generate() {
        return new Random().nextInt(3) + 1;
    }
}
