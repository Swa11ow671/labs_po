package com.example.task0;

public class Number {

        public double countPr(double sum, int pr){
            return sum/100*pr;
        }
        public double countSum(double sum, int pr){
            return sum + sum/100*pr;
        }
        public int countSumTrunc(double sum, int pr){
            return (int) Math.round(sum + sum/100*pr);
        }

}
