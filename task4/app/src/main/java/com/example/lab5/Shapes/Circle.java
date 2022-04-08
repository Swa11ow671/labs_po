package com.example.lab5.Shapes;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Toast;

import com.example.lab5.Copyable;

public class Circle extends Shape implements Copyable {
    Context context;
    @Override
    public void draw(Paint paint, Canvas canvas, Context context, float[] pos) {
        this.context = context;
        paint.setColor(Color.parseColor(setColor(color)));
        canvas.drawCircle(pos[0],pos[1], 143,  paint);
        discriptor();
    }

    @Override
    public String setColor(String color) {
        color = "#EADEDB";
        return color;
    }

    @Override
    public void discriptor() {
        Toast.makeText(context, "Нарисован круг", Toast.LENGTH_LONG).show();
    }

    @Override
    public Object copy() {
        return new Circle();
    }
}