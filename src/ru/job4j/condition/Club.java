package ru.job4j.condition;

public class Club {
    public static void main(String[] args) {
        Club.permission(false, true);
    }

    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }
}
