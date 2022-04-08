package com.example.lab4.Factory.Interface;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.example.lab4.Factory.Arrows.AssociationArrow;

public interface Arrow {
    void drawArrow(Paint paint, Canvas canvas, float[] pos);
}
