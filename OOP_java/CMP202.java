package OOP_java;
public class CMP202 {
    String name, password;
    int age;
    float height;

    void printUserDetails() {
        age = 23;
        height = 170;
        name = "jamesOOP";
        name.length(); //gets the length of string name
        password = "123456";
        if (password.contains("123456") || password.contains("abcdef")) {
            System.out.println("password is too short");
        }
    }

    public static void main(String[] args){
        CMP202 student = new CMP202();
        student.printUserDetails();
        
    }
}
