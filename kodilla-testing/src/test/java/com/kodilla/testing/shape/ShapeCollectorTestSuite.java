package com.kodilla.testing.shape;

import org.junit.*;
import java.util.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {

        ShapeCollector collector = new ShapeCollector();

        collector.addFigure(new Circle(5.5));

        List<Shape> shapes = collector.getShapes();

        Shape expected = new Circle(5.5);
        Shape actual = shapes.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFigure() {

        ShapeCollector collector = new ShapeCollector();

        collector.addFigure(new Circle(5.5));
        collector.addFigure(new Square(10));
        collector.addFigure(new Triangle(6, 4.5));

        collector.removeFigure(new Circle(5.5));

        List<Shape> expected = new ArrayList<>();

        expected.add(new Square(10));
        expected.add(new Triangle(6, 4.5));

        List<Shape> actual = collector.getShapes();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFigure() {

        ShapeCollector collector = new ShapeCollector();

        collector.addFigure(new Circle(5.5));
        collector.addFigure(new Square(10));
        collector.addFigure(new Triangle(6, 4.5));

        Shape expected = new Square(10);
        Shape actual = collector.getFigure(1);

        Assert.assertEquals(expected, actual);
    }
}
