package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        boolean conditions = first > second;
        return conditions ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int four) {
        return max(max(first, second), max(third, four));
    }
}
