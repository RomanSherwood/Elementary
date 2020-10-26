package ru.job4j.condition;

import java.lang.reflect.GenericArrayType;

public class Game {
    public static void main(String[] args) {
        Game.menu("Mario");
        Game.menu("Tanks");
        Game.menu("WoW");
    }

    public static void menu(String name) {
        if (name.equals("Mario")) {
            System.out.println("Start - Super Mario");
        }
        if (name.equals("Tanks")) {
            System.out.println("Start - World of Tanks");
        }
        if (name.equals("WoW")) {
            System.out.println("Start - World of Warcraft");
        }
    }
}
