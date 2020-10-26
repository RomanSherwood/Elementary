package ru.job4j.condition;

public class DummyBot {
    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Ты хороший бот?");
        System.out.println(rsl);
    }

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, бот.".equals(question)) {
            rsl = "Привет умник!";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }
}
