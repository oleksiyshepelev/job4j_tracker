package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " eat " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void givName(String nick) {
        name = nick;
    }
}
