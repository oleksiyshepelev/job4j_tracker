package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int idItem = input.askInt("Enter ID: ");
        String nameItem = input.askStr("Enter name: ");
        Item item = new Item(idItem, nameItem);
        if (tracker.replace(idItem, item)) {
            out.println("The item with id " + idItem + System.lineSeparator()
                    + " was replaced by the item: " + nameItem);
        } else {
            out.println("The item for edit was not found.");
        }
        return true;
    }
}
