package com.example.task1.Shape;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Square extends Shape{
    double side;
    String color;
    public Square(String color, double side) {
        super(color);
        this.color = color;
        this.side = side;
    }


    @Override
    double area() {
        return side*side;
    }

    @Override
    public void draw(Paint paint, Canvas canvas) {
                paint.setColor(Color.parseColor(color));
                canvas.drawRect(70,140, (float) (70+side), (float) (140+side), paint);
    }

    @Override
    public String name() {
        return "Цвет квадрата в RGB: " + super.color +  " и площадь: " + area();
    }

}
