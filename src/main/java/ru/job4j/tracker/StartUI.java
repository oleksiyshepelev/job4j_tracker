package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(1, name);
                tracker.add(item);
                System.out.println("---");
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] allItems = tracker.findAll();
                if (allItems.length > 0) {
                    for (int i = 0; i < allItems.length; i++) {
                        System.out.println(allItems[i]);
                    }
                } else {
                    System.out.println("There are no items yet");
                }
                System.out.println("---");
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.println("Enter ID: ");
                int idItem = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter name: ");
                String nameItem = scanner.nextLine();
                Item toReplase = new Item(idItem, nameItem);
                if (tracker.replace(idItem, toReplase)) {
                    System.out.print("The item with id " + idItem);
                    System.out.println(" was replaced by the item: " + nameItem);
                } else {
                    System.out.println("The item for edit was not found.");
                }
                System.out.println("---");
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.println("Please enter the id: ");
                int idDel = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(idDel)) {
                    System.out.print("The item with ID: " + idDel);
                    System.out.println(" was removed.");
                } else {
                    System.out.println("The item with ID " + idDel + " was not found.");
                }
                System.out.println("---");
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Please enter the id: ");
                int fId = Integer.parseInt(scanner.nextLine());
                Item itemById = tracker.findById(fId);
                if (itemById != null) {
                    System.out.print("The item with this ID ");
                    System.out.println(" is " + itemById);
                } else {
                    System.out.println("The item with this ID was not found.");
                }
                System.out.println("---");
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.println("Please enter the name: ");
                String theName = scanner.nextLine();
                Item[] itemByName = tracker.findByName(theName);
                if (itemByName.length > 0) {
                    for (int i = 0; i < itemByName.length; i++) {
                        System.out.println(itemByName[i]);
                    }
                } else {
                    System.out.println("The item with this name was not found.");
                }
                System.out.println("---");
            } else if (select == 6) {
                run = false;
            } else {
                this.showMenu();
            }
        }
    }

    public void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
