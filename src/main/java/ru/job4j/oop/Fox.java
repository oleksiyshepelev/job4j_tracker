package ru.job4j.oop;

public class Fox {
    public void sayName() {
        System.out.println("Лиса");
    }

    public void tryEat() {
        sayName();
        System.out.println("Колобок, Колобок, я тебя съем!");
    }

    public void eat(Ball ball) {
        tryEat();
        System.out.println("гам!");
    }
}
