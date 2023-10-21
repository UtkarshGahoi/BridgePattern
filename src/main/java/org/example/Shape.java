package org.example;

public abstract class Shape {
    protected DrawingSumAPI drawingSumAPI;

    public Shape(DrawingSumAPI drawingSumAPI) {
        this.drawingSumAPI = drawingSumAPI;
    }

    public abstract void sum();

}
