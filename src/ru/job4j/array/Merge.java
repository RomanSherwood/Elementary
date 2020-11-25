package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int rslIndex = 0;
        while (leftIndex + rightIndex != rsl.length) {
            if (leftIndex != left.length && rightIndex != right.length) {
                rsl[rslIndex++] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            } else if (leftIndex != left.length) {
                rsl[rslIndex++] = left[leftIndex++];
            } else {
                rsl[rslIndex++] = right[rightIndex++];
            }
        }
        return rsl;
    }
}
