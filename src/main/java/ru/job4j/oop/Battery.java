package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery rechargeable1000 = new Battery(1000);
        Battery duracell200 = new Battery(200);
        System.out.println("Before:");
        System.out.println("Rchargeable " + rechargeable1000.load);
        System.out.println("Duracell " + duracell200.load);
        duracell200.exchange(rechargeable1000);
        System.out.println();
        System.out.println("After:");
        System.out.println("Rchargeable " + rechargeable1000.load);
        System.out.println("Duracell " + duracell200.load);
    }
}
