package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUsername()) && users[i].isValid()) {
                return users[i];
            }
        }
        throw new UserNotFoundException("User not found.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        String name = user.getUsername();
        int len = name.length();
        if (len < 3 && !user.isValid()) {
            throw new UserInvalidException("Invalid User.");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr1 Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}