package com.example.lab5.Shapes;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Toast;

import com.example.lab5.Copyable;

public class Square extends Shape implements Copyable {
    Context context;
    @Override
    public void draw(Paint paint, Canvas canvas, Context context, float[] pos) {
        this.context = context;
        paint.setColor(Color.parseColor(setColor(color)));
        canvas.drawRect(pos[0],pos[1],pos[0]+400, pos[1]+400,  paint);
        discriptor();
    }

    @Override
    public String setColor(String color) {
        color = "#C0AB8E";
        return color;
    }

    @Override
    public void discriptor() {
        Toast.makeText(context, "Нарисован квадрат", Toast.LENGTH_LONG).show();
    }
    @Override
    public Object copy() {
        return new Square();
    }
}