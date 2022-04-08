package com.example.lab3;

public class ShadeFactory {
    public Shape createPolygon(int numberOfSides) {
        if (numberOfSides == 0){
            return new Circle();
        }

        else if (numberOfSides == 1){
            return new Dot();
        }

        else if (numberOfSides == 2){
            return new Band();
        }

        else if (numberOfSides == 3){
            return new Triangle();
        }

        else if (numberOfSides == 4){
            return new Square();
        }

        else if (numberOfSides == 5){
            return new Pentagon();
        }
        return null;
    }
}
