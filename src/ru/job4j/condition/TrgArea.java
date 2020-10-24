package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double summOf = (a + b + c) / 2;
        double square = Math.sqrt(summOf);
        return square;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
