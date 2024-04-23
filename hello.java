public class hello {
    public static void main(String a[]) {
        System.out.println("hello world");
        // we use PascalCase for classes, and camelCase for functions and variables
        String name = "tony";
        System.out.println(name);
        double d1 = 12E4d;
        System.out.println(d1);
        float f1 = 34e3f;
        System.out.println(f1);
    };
    public static void fun(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
      }
}