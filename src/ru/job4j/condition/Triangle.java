package ru.job4j.condition;

public class Triangle {
    public static void main(String[] args) {
        boolean rsl = Triangle.exist(23.1, 22.7, 10.0);
        System.out.println("Triangle ab = 23.1, ac = 22.7, bc = 10.0 can live :D bcs the statement is " + rsl);

    }

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
