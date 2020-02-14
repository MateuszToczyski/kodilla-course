package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> shapes;

    public ShapeCollector() {
        this.shapes = new ArrayList<>();
    }

    public ArrayList<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }
}
