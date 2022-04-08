package com.example.lab5.Shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;


public abstract class Shape {
    String color;


    public abstract String setColor(String color);
    public abstract void discriptor();
    abstract void draw(Paint paint, Canvas canvas, Context context, float[] pos);

}
