package org.example;

public class DemoShape extends Shape{
    private int x, y, radius;

    public DemoShape(int x, int y, int radius, DrawingSumAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void sum() {
        drawingSumAPI.sum(x, y);
    }
}
