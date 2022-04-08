package com.example.lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.IpPrefix;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.lab4.Factory.Arrows.AddictionArrow;
import com.example.lab4.Factory.Arrows.AssociationArrow;
import com.example.lab4.Factory.Arrows.ImplementationArrow;
import com.example.lab4.Factory.Arrows.InheritanceArrow;

public class MainActivity extends AppCompatActivity {
    Button but;
    Paint paint;
    Canvas canvas;
    Bitmap bitmap;
    LinearLayout linearLayout;
    DisplayMetrics displayMetrics;
    int height, width;
    float x, y, xS, yS, xE, yE;
    float[] pos;
    String arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.but);

        displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;

        linearLayout = findViewById(R.id.Liner);
        paint = new Paint();
        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        paint.setColor(Color.BLUE);
        drawCircle();
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout = findViewById(R.id.Liner);
                paint = new Paint();
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bitmap);
                paint.setColor(Color.BLUE);
                bitmap.eraseColor(Color.TRANSPARENT);
                drawCircle();
            }
        });

    }

        @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY()-230;

        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN: // нажатие
                xS = x;
                yS = y;
                break;
            case MotionEvent.ACTION_MOVE: // движение
                break;
            case MotionEvent.ACTION_UP: // отпускание

                yE = y;
                xE = x;
                pos = new float[]{xS, yS, xE, yE};
                linearLayout.setBackground(new BitmapDrawable(bitmap));
                switch (arrow) {
                    case "Association":
                        AssociationArrow associationArrow = new AssociationArrow();
                        associationArrow.drawArrow(paint, canvas, pos);
                        break;
                    case "Inheritance":
                        InheritanceArrow inheritanceArrow = new InheritanceArrow();
                        inheritanceArrow.drawArrow(paint, canvas, pos);
                        break;
                    case "Implementation":
                        ImplementationArrow implementationArrow = new ImplementationArrow();
                        implementationArrow.drawArrow(paint, canvas, pos);
                        break;
                    case "Addiction":
                        AddictionArrow addictionArrow = new AddictionArrow();
                        addictionArrow.drawArrow(paint, canvas, pos);
                        break;
                    case "Aggregation":

                        break;
                    case "Composition":
                        //CompositionArrow compositionArrow = new CompositionArrow().drawArrow(paint, canvas, pos);
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
            case R.id.action_Association:
                //Ассоциация
                arrow = "Association";
                break;

            case R.id.action_Inheritance:
                //Наследование
                arrow = "Inheritance";
                break;

            case R.id.action_Implementation:
                //Реализация
                arrow = "Implementation";
                break;

            case R.id.action_Addiction:
                //Зависимость
                arrow = "Addiction";
                break;

            case R.id.action_Aggregation:
                //Агрегация
                arrow = "Aggregation";
                break;

            case R.id.action_Composition:
                //Композиция
                arrow = "Composition";
                break;

            default:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void drawCircle(){
        linearLayout.setBackground(new BitmapDrawable(bitmap));
        canvas.drawCircle(100,600, 80,  paint);
        canvas.drawCircle(950,600, 80,  paint);
    }
}