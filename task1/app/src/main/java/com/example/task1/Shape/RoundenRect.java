package com.example.task1.Shape;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class RoundenRect extends Shape{
    float height, width;
    String color;
    public RoundenRect(String color, float height, float width) {
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
                canvas.drawRoundRect(400,153, height, width, 23, 23, paint);
    }

    @Override
    public String name() {
        return "Цвет закр. прямоугольника в RGB: " + super.color +  " и площадь: сложная(" ;
    }



}
