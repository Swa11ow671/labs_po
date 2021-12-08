package com.example.task1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.task1.Shape.Circle;
import com.example.task1.Shape.Ellipse;
import com.example.task1.Shape.Rect;
import com.example.task1.Shape.RoundenRect;
import com.example.task1.Shape.Square;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    Paint paint;
    Bitmap bg;
    Canvas canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.draw_area);
        paint = new Paint();
        bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bg);
        linearLayout.setBackground(new BitmapDrawable(bg));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.btn_circle:
                Circle circle = new Circle("#ffd000", (float) 54.3);
                circle.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), circle.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_ellipse:
                float left, top, right, bottom;
                left = 400;
                top = 400;
                right = 200;
                bottom = 200;
                Ellipse ellipse = new Ellipse("#00ff00", left, top, left+right, top+bottom);
                ellipse.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), ellipse.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_rect:
                Rect rect = new Rect("#ff0000", 150.323F, 240);
                rect.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), rect.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_roundedRect:
                RoundenRect roundenRect = new RoundenRect("#a6ffff", (float) 90.4, 500);
                roundenRect.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), roundenRect.name(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.btn_square:
                Square square = new Square("#ffffff",200);
                square.draw(paint, canvas);
                Toast.makeText(getApplicationContext(), square.name(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}