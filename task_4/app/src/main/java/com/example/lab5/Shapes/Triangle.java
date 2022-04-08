package com.example.lab5.Shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.Toast;

import com.example.lab5.Copyable;

public class Triangle extends Shape implements Copyable {
    Context context;
    @Override
    public void draw(Paint paint, Canvas canvas, Context context, float[] pos) {
        this.context = context;
        paint.setColor(Color.parseColor(setColor(color)));
        Path path = new Path();
        path.moveTo(pos[0], pos[1]); // Top
        path.lineTo(pos[0]+375,pos[1]+525); // Bottom left
        path.lineTo(pos[0]+525, pos[1]+450); // Bottom right
        path.lineTo(pos[0], pos[1]); // Back to Top
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

    @Override
    public Object copy() {
        return new Triangle();
    }
}