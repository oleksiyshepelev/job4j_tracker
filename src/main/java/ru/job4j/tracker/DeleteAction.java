package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        int idDel = input.askInt("Please enter the id: ");
        if (tracker.delete(idDel)) {
            out.println("The item with ID: " + idDel + ", was removed.");
        } else {
            out.println("The item with ID " + idDel + " was not found.");
        }
        return true;
    }
}
