package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " is eating " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void givName(String nick) {
         name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.givName("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.givName("Black");
        black.eat("fish");
        black.show();
    }
}
