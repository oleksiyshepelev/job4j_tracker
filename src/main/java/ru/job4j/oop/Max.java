package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        boolean conditions = first > second;
        return conditions ? first : second;
    }

    public static int max(int first, int second, int third) {
        boolean conditions = max(first, second) > third;
        return conditions ? max(first, second) : third;
    }

    public static int max(int first, int second, int third, int four) {
        boolean conditions = max(first, second) > max(third, four);
        return conditions ? max(first, second) : max(third, four);
    }
}
