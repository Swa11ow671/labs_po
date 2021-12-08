package com.example.task1.Shape;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle extends Shape{
    float radius;
    String color;
    public Circle(String color, float radius) {
        super(color);
        this.color = color;
        this.radius = radius;
    }


    @Override
    double area() {
        return 3.14*radius*radius;
    }

    @Override
    public void draw(Paint paint, Canvas canvas) {
                paint.setColor(Color.parseColor(color));
                canvas.drawCircle(200,100, radius,  paint);
    }

    @Override
    public String name() {
        return "Цвет круга в RGB: " + super.color +  " и площадь: " + area();
    }

}
