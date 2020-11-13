package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 2}, {1, 2, 3}, {3, 5, 2, 1}};
        for (int[] number : numbers) {
            System.out.println("Размер массива равен: " + number.length);
        }
    }
}
