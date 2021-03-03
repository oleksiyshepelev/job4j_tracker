package ru.job4j.tracker;

public class DeleteAction implements UserAction{

    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idDel = input.askInt("Please enter the id: ");
        if (tracker.delete(idDel)) {
            System.out.print("The item with ID: " + idDel);
            System.out.println(", was removed.");
        } else {
            System.out.println("The item with ID " + idDel + " was not found.");
        }
        return true;
    }
}
