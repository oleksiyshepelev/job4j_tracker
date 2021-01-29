package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hape zajas = new Hape();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();
        zajas.tryEat(kolobok);
        kolobok.getOff();
        System.out.println("");
        volk.tryEat(kolobok);
        kolobok.getOff();
        System.out.println("");
        lisa.eat(kolobok);
    }
}
