package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new DemoShape(1, 2, 3, new DrawingSumAPI1()),
                new DemoShape(5, 7, 11, new DrawingSumAPI2())
        };
        for (Shape shape : shapes) {
            shape.sum();
        }

    }
}