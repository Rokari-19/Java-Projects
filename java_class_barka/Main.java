package java_class_barka;

public class Main {
    String name = "john doe";
    String password;
    String schoolName;
    String matricNo;
    int staffNo;
    public static void main(String[] args) {
        Person abigail = new Person("binghamUni", "ajiri", "xyz1234", "098");
        Person lecturer = new Person("uniBingham", "barka", "xyz1234", 0064);

        abigail.setName("rokari");
        abigail.setPass("xyzzabc");
        System.out.println(abigail.getName());
        System.out.println(lecturer.getName());
        System.out.println(abigail.getPass());
    }


}


