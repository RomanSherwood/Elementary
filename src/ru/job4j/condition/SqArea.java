package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        int height = p / (2 * (k + 1));
        int lenght = height * k;
        int s = lenght * height;

        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println("p = 6, k = 4, s = 2, real = " + result);
    }
}
