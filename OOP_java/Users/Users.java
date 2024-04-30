package OOP_java.Users;

public class Users {
    String name;
    String password;
    String login() {
        return "logged in";
    }

    String register() {
        if (name.equals("") || password.equals("")) {
            return "can't be empty";
        } else {
            return "Success";
        }
    }
}
