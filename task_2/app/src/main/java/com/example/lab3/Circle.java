package com.example.lab3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Toast;

public class Circle extends Shape{
    Context context;
    @Override
    public void draw(Paint paint, Canvas canvas, Context context) {
                this.context = context;
                paint.setColor(Color.parseColor(setColor(color)));
                canvas.drawCircle(200,200, 143,  paint);
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

}
