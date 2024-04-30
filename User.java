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
    boolean checker() {
        if (3 != 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        User jane = new User();
        User luke = new User();
        System.out.println(luke.checker());
        System.out.println(jane.login());
    }
}