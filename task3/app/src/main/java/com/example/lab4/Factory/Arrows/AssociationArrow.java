package com.example.lab4.Factory.Arrows;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

import com.example.lab4.Factory.Interface.Arrow;

public class AssociationArrow implements Arrow {
    @Override
    public void drawArrow(Paint paint, Canvas canvas, float[] pos) {

        paint.setColor(Color.RED);
        paint.setStrokeWidth(15f);
        canvas.drawLine(pos[0], pos[1], pos[2], pos[3], paint);

        //Кончик стрелочки
        float x0 = pos[0];
        float y0 = pos[1];
        float x1 = pos[2];
        float y1 = pos[3];

        float deltaX = x1 - x0;
        float deltaY = y1 - y0;
        double distance = Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
        float frac = (float) (1 / (distance / 30));

        float point_x_1 = x0 + (float) ((1 - frac) * deltaX + frac * deltaY);
        float point_y_1 = y0 + (float) ((1 - frac) * deltaY - frac * deltaX);

        float point_x_2 = x1;
        float point_y_2 = y1;

        float point_x_3 = x0 + (float) ((1 - frac) * deltaX - frac * deltaY);
        float point_y_3 = y0 + (float) ((1 - frac) * deltaY + frac * deltaX);

        Path path = new Path();
        paint.setStrokeWidth(10);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);

        path.moveTo(point_x_1, point_y_1);
        path.lineTo(point_x_2, point_y_2);
        path.moveTo(point_x_3, point_y_3);
        path.lineTo(point_x_2, point_y_2);
        path.close();

        canvas.drawPath(path, paint);

    }
}
