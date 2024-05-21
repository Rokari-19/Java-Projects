package OOP_java.Users;

public class Users {
    String name;
    private String schoolName = "bingham university";
    private String password;
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

    String getName() {
        return schoolName;
    }

    void setName(String name) {
        this.name = name;
    }
}
