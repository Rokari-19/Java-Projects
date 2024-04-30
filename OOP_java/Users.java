package OOP_java;

public class Users {
    String name;
    String password;
    String login() {
        return "logged in";
    }

    String Register() {
        if (name.equals("") || password.equals("")) {
            return "can't be empty";
        } else {
            return "Success";
        }
    }
}
