package com.example.lab3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.graphics.Path;
import android.widget.Toast;

public class Triangle extends Shape{
    Context context;
    @Override
    public void draw(Paint paint, Canvas canvas, Context context) {
        this.context = context;
        paint.setColor(Color.parseColor(setColor(color)));
        Path path = new Path();
        path.moveTo(150, 75); // Top
        path.lineTo(75,225); // Bottom left
        path.lineTo(225, 225); // Bottom right
        path.lineTo(150, 75); // Back to Top
        path.close();
        canvas.drawPath(path, paint);
        discriptor();
    }

    @Override
    public String setColor(String color) {
        color = "#B4B7BA";
        return color;
    }

    @Override
    public void discriptor() {
        Toast.makeText(context, "Нарисован треугольник", Toast.LENGTH_LONG).show();
    }

}
