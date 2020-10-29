package ru.job4j.condition;

public class ChessBoard {
    public static void main(String[] args) {
        int rsl = ChessBoard.way(6, 7, 1, 2);
        System.out.println(rsl);
        rsl = ChessBoard.way(2, 6, 4, 1);
        System.out.println(rsl);
        rsl = ChessBoard.way(4, 2, 1, 5);
        System.out.println(rsl);
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }
}
