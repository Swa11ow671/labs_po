package com.example.task1.Shape;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ellipse extends Shape{
    float left, top, right, bottom;
    String color;
    public Ellipse(String color, float left, float top, float right, float bottom  ) {
        super(color);
        this.color = color;
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }


    @Override
    double area() {
        //Модуль во избежание отрицательных значений
        return Math.abs(3.14*(left-right)*(top-bottom));
    }

    @Override
    public void draw(Paint paint, Canvas canvas) {
                paint.setColor(Color.parseColor(color));
                canvas.drawOval(left,top, right, bottom, paint);
    }

    @Override
    public String name() {
        return "Цвет эллипса в RGB: " + super.color +  " и площадь: " + area();
    }

}
