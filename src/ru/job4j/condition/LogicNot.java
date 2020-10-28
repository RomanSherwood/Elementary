package ru.job4j.condition;

public class LogicNot {
    public static void main(String[] args) {
        boolean rsl = LogicNot.isEven(2);
        System.out.println("Number 2 is Even - " + rsl);
        rsl = LogicNot.isPositive(-19);
        System.out.println("Number -19 is Positive - " + rsl);
        rsl = LogicNot.notEven(9);
        System.out.println("Number 9 is not Even - " + rsl);
        rsl = LogicNot.notPositive(23);
        System.out.println("Number 23 is not Positive - " + rsl);
        rsl = LogicNot.notEvenAndPositive(83);
        System.out.println("Number 83 is not Even and Positive - " + rsl);
        rsl = LogicNot.evenOrNotPositive(123);
        System.out.println("Number 123 is Even and not Positive - " + rsl);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
       return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}
