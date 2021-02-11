package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Going");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("They are " + pass + " passengers");
    }

    @Override
    public double price(int gas) {
        return (2.25 * gas);

    }
}
