package ru.job4j.oop;

public class Fix {
    private String desc;

    Fix(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        Fix fixik = new Fix("description");
    }
}
