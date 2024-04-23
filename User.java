public class User {
    String username = "rokari";
    String password = "Pass";
    String login() {
        if (username.equals("rokari") && password.equals("Pass")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    public static void main(String[] args) {
        User jane = new User();
        System.out.println(jane.login());
    }
}