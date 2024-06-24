package java_class_barka;

public class Person extends Main {


    public Person(String schoolName, String name, String password, String matricNo) {
        this.schoolName = schoolName;
        this.matricNo = matricNo;
        this.password = password;
        this.name = name;
    }

    public Person(String schoolName, String name, String password, int staffNo) {
        this.schoolName = schoolName;
        this.staffNo = staffNo;
        this.password = password;
        this.name = name;
    }

    String getName() {
        return name;
    }


    void setName(String name) {
        this.name = name;
    }

    void setPass(String passString) {
        this.password = passString;
    }

    String getPass() {
        return password;
    }
    
}
