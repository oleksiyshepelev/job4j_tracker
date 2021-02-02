package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static int max(int first, int second, int third) {
        boolean condition = max(first, second) > third;
        return condition ? max(first, second) : third;
    }

    public static int max(int first, int second, int third, int four) {
        boolean condition = max(first, second) > max(third, four);
        return condition ? max(first, second) : max(third, four);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(3, 70));
        System.out.println(Max.max(7, 7, 3));
        System.out.println(Max.max(1, 2, 3, 9));
    }
}
