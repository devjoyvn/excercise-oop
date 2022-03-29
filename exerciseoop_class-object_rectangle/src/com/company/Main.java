package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(10);
        rectangle1.setWidth(13);
        System.out.println(rectangle1.toString());
        System.out.println("Area: " + rectangle1.getArea());
    }
}
