package ru.sun.openapiclient;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Second string");
        System.out.println("Third string");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.a + " = " + s.area());
    }
}