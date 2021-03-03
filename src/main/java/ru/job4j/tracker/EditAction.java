package ru.job4j.tracker;

public class EditAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idItem = input.askInt("Enter ID: ");
        String nameItem = input.askStr("Enter name: ");
        Item toReplase = new Item(idItem, nameItem);
        if (tracker.replace(idItem, toReplase)) {
            System.out.print("The item with id " + idItem);
            System.out.println(" was replaced by the item: " + nameItem);
        } else {
            System.out.println("The item for edit was not found.");
        }
        return true;
    }
}
