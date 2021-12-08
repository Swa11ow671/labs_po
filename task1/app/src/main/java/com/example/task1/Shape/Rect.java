package com.example.task1.Shape;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Rect extends Shape{
    float height, width;
    String color;
    public Rect(String color, float height, float width) {
        super(color);
        this.color = color;
        this.height = height;
        this.width = width;
    }


    @Override
    double area() {
        return width*height;
    }

    @Override
    public void draw(Paint paint, Canvas canvas) {
                paint.setColor(Color.parseColor(color));
                canvas.drawRect(50,50, height, width, paint);
    }

    @Override
    public String name() {
        return "Цвет прямоугольника в RGB: " + super.color +  " и площадь: " + area();
    }



}
