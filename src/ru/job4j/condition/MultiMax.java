package ru.job4j.condition;

public class MultiMax {
    public static void main(String[] args) {
        int rsl = MultiMax.max(-22, 2, -2);
        System.out.println(rsl);
    }

    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        int result2 = result > third ? result : third;
        return result2;
    }
}
