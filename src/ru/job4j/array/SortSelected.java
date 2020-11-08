package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) { //3, 4, 1, 2, 5
            int min = Min.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
