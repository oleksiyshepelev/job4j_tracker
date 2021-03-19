package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by Id ===");
        int fId = input.askInt("Please enter the id: ");
        Item itemById = tracker.findById(fId);
        if (itemById != null) {
            out.println("The item with this ID is:" + System.lineSeparator() + itemById);
        } else {
            out.println("The item with this ID was not found.");
        }
        return true;
    }
}
