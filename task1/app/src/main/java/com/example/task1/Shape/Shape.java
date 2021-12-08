package com.example.task1.Shape;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract String name();
    abstract double area();
    abstract void draw(Paint paint, Canvas canvas);

}
