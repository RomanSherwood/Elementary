package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(2000);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("2000 rubles are " + dollar + " dollars");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        in = 2000;
        expected = 33;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("2000 rubles are 33. Test result: " + passed);
    }
}

