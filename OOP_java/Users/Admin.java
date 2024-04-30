package OOP_java.Users;

public class Admin extends Users{
    String staffNo;

    void uploadResult(String course, float score) { // i used void because it doesn't  return anything
            
    }

    public static void main(String[] args) {
        Admin barka = new Admin();
        barka.uploadResult("CMP202", 70);
        
    }

}
