package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double xCoodrs = x2 - x1;
        double yCoords = y2 - y1;
        double rsl;
        xCoodrs = Math.pow(xCoodrs, 2);
        yCoords = Math.pow(yCoords, 2);
        rsl = xCoodrs + yCoords;
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(13,80,34,12);
        System.out.println("result (13, 80) to (34, 12) is " + result);
    }
}
