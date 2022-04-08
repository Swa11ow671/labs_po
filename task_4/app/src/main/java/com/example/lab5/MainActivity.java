package com.example.lab5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.example.lab5.Shapes.Circle;
import com.example.lab5.Shapes.Rectangle;
import com.example.lab5.Shapes.Shape;
import com.example.lab5.Shapes.Square;
import com.example.lab5.Shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Paint paint;
    Canvas canvas;
    Bitmap bitmap;
    LinearLayout linearLayout;
    float x, y;
    float[] pos;
    String shape;

    List<Shape> shapes = new ArrayList<>();
    List<Shape> shapesCopy = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.Liner);
        paint = new Paint();
        bitmap = Bitmap.createBitmap(1080, 2200, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        paint.setColor(Color.BLUE);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY()-230;

        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN: // нажатие
                break;
            case MotionEvent.ACTION_MOVE: // движение
                break;
            case MotionEvent.ACTION_UP: // отпускание
                pos = new float[]{x, y};
                linearLayout.setBackground(new BitmapDrawable(bitmap));
                switch (shape) {
                    case "Круг":
                        bitmap.eraseColor(Color.TRANSPARENT);
                        Circle circle = new Circle();
                        Circle copyCircle = (Circle)circle.copy();
                        copyCircle.draw(paint, canvas, this, pos);
                        break;
                    case "Квадрат":
                        bitmap.eraseColor(Color.TRANSPARENT);
                        Square square = new Square();
                        Square copySquare = (Square)square.copy();
                        copySquare.draw(paint, canvas, this, pos);
                        break;
                    case "Треугольник":
                        bitmap.eraseColor(Color.TRANSPARENT);
                        Triangle triangle = new Triangle();
                        Triangle copyTriangle = (Triangle)triangle.copy();
                        copyTriangle.draw(paint, canvas, this, pos);
                        break;
                    case "Прямоугольник":
                        bitmap.eraseColor(Color.TRANSPARENT);
                        Rectangle rectangle = new Rectangle();
                        Rectangle copyRectangle = (Rectangle)rectangle.copy();
                        copyRectangle.draw(paint, canvas, this, pos);
                        break;
                }


        }
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.circle:
                shape = "Круг";
                break;

            case R.id.square:
                shape = "Квадрат";
                break;

            case R.id.triangle:
                shape = "Треугольник";
                break;
            case R.id.rectangle:
                shape = "Прямоугольник";
                break;


            default:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}