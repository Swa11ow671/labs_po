package com.example.lab3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Toast;

public class Dot extends Shape{
    Context context;
    @Override
    public void draw(Paint paint, Canvas canvas, Context context) {
                this.context = context;
                paint.setColor(Color.parseColor(setColor(color)));
                canvas.drawCircle(200,200, 5,  paint);
                discriptor();
    }

    @Override
    public String setColor(String color) {
        color = "#2E4A62";
        return color;
    }

    @Override
    public void discriptor() {
        Toast.makeText(context, "Нарисована точка", Toast.LENGTH_LONG).show();
    }

}
