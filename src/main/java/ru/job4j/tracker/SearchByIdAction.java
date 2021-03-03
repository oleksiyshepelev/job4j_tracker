package ru.job4j.tracker;

public class SearchByIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int fId = input.askInt("Please enter the id: ");
        Item itemById = tracker.findById(fId);
        if (itemById != null) {
            System.out.print("The item with this ID ");
            System.out.println("is " + itemById);
        } else {
            System.out.println("The item with this ID was not found.");
        }
        return true;
    }
}
