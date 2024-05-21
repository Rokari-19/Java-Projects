public class Main {
    int length = 23;
    int breadth = 50;
    int area;
    public static void main(String[] args) {
        Main calc = new Main();
        calc.area = calc.length * calc.breadth;

        System.out.println("the area of object is " + calc.area);
    }
}