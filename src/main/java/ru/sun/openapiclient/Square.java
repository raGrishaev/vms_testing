package ru.sun.openapiclient;

public class Square {
    double a;

    public Square(double a){
        this.a = a;
    }

    public double area(){
        return this.a * this.a;
    }
}
