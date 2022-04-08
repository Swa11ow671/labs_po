package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    EditText numberOfSides;
    Button draw;
    LinearLayout linearLayout;
    Paint paint;
    Bitmap bg;
    Canvas canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOfSides = findViewById(R.id.numberOfSides);
        draw = findViewById(R.id.draw);

        linearLayout = findViewById(R.id.Liner);


        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Инициализация каждый раз, для отрисовки новой фигуры без наложения на другую
                paint = new Paint();
                bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bg);
                linearLayout.setBackground(new BitmapDrawable(bg));

                ShadeFactory shadeFactory = new ShadeFactory();
                //Берём строку из editText и конв. её в число
                String s = numberOfSides.getText().toString();
                int sides = Integer.parseInt(s);
                Shape shape = shadeFactory.createPolygon(sides);
                //Передача контекста для вызова Toast
                shape.draw(paint, canvas, MainActivity.this);
            }
        });
    }
}