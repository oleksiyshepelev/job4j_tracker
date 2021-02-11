package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("the bus goes on the highway");
    }

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle[] vehicles = {bus, train, airplane};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
