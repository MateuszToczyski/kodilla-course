package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    public enum Bun {
        PLAIN,
        SESAME
    }

    public enum Sauce {
        STANDARD,
        THOUSAND_ISLAND,
        BBQ
    }

    public enum Ingredient {
        BACON,
        ONION,
        PEPPERS
    }

    private final Bun bun;
    private final Sauce sauce;
    private final int burgerCount;
    private final List<Ingredient> ingredients;

    private Bigmac(Bun bun, Sauce sauce, int burgerCount, List<Ingredient> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgerCount = burgerCount;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public int getBurgerCount() {
        return burgerCount;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public static class Builder {
        private Bun bun;
        private Sauce sauce;
        private int burgerCount;
        private final List<Ingredient> ingredients = new ArrayList<>();

        public Builder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public Builder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder burgerCount(int burgerCount) {
            this.burgerCount = burgerCount;
            return this;
        }

        public Builder ingredient(Ingredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauce, burgerCount, ingredients);
        }
    }
}
