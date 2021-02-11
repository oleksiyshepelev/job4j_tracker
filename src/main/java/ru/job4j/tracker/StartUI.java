package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askInt("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
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
                int idItem = Integer.valueOf(input.askInt("Enter ID: "));
                String nameItem = input.askStr("Enter name: ");
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
                int idDel = Integer.valueOf(input.askInt("Please enter the id: "));
                if (tracker.delete(idDel)) {
                    System.out.print("The item with ID: " + idDel);
                    System.out.println(" was removed.");
                } else {
                    System.out.println("The item with ID " + idDel + " was not found.");
                }
                System.out.println("---");
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                int fId = Integer.valueOf(input.askInt("Please enter the id: "));
                Item itemById = tracker.findById(fId);
                if (itemById != null) {
                    System.out.print("The item with this ID ");
                    System.out.println("is " + itemById);
                } else {
                    System.out.println("The item with this ID was not found.");
                }
                System.out.println("---");
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String theName = input.askStr("Please enter the name: ");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
