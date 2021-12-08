package com.example.task0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Инициализация переменных
    EditText sumInCheck;
    Button countPr, countSum, countSumTrunc;
    TextView countPrText, countSumText, countSumTruncText;
    Number number = new Number();
    int pr = getProcent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Сумма в чеке
        sumInCheck = findViewById(R.id.sumInCheck);
        countPrText = findViewById(R.id.countPrText);
        countSumText = findViewById(R.id.countSumText);
        countSumTruncText = findViewById(R.id.countSumTruncText);
        // 1 кнопка
        countPr = findViewById(R.id.countPr);
        countPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sum = sumInCheck.getText().toString();
                double sumDouble = Integer.valueOf(sum);
                countPr(sumDouble);
            }
        });
        // 2 кнопка
        countSum = findViewById(R.id.countSum);
        countSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sum = sumInCheck.getText().toString();
                double sumDouble = Integer.valueOf(sum);
                countSum(sumDouble);
            }
        });
        // 3 кнопка
        countSumTrunc = findViewById(R.id.countSumTrunc);
        countSumTrunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sum = sumInCheck.getText().toString();
                double sumDouble = Integer.valueOf(sum);
                countSumTrunc(sumDouble);
            }
        });
    }

    //значение  заданного процента от суммы
    public void countPr(double sum){
        String proc = String.valueOf(number.countPr(sum, pr));
        countPrText.setText(proc);
    }
    //значение  итоговой суммы с учетом заданного процента от суммы
    public void countSum(double sum){
        String proc = String.valueOf(number.countSum(sum, pr));
        countSumText.setText(proc);
    }
    //округленное до ближайшего целого значение  итоговой суммы с учетом заданного процента от суммы
    public void countSumTrunc(double sum){
        String proc = String.valueOf(number.countSumTrunc(sum, pr));
        countSumTruncText.setText(proc);
    }
    //Проценты
    public int getProcent(){
        int pr = (int) (1+Math.random()*3);
        //Если 1 - большие, 2 - обычные, 3 - мелочь
        if (pr==1){
            pr=15;
        }
        else if (pr==2){
            pr = 9;
        }
        return pr;
    }
}