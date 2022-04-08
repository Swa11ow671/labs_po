package com.example.lab3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Toast;

public class Square extends Shape{
    Context context;
    @Override
    public void draw(Paint paint, Canvas canvas, Context context) {
                this.context = context;
                paint.setColor(Color.parseColor(setColor(color)));
                canvas.drawRect(100,100,250, 250,  paint);
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

}
