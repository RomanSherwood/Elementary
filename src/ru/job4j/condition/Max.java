package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        int rsl = Max.max(3, 5);
        System.out.println(rsl);
    }

    public  static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
