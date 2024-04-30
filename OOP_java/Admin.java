package OOP_java;

public class Admin extends Users{
    String staffNo;
    void uploadResult(String course, float score) {
        System.out.println(course+ " " + score );
    }

}
