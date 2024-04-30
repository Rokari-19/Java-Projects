package OOP_java.Animals;

public class Aquatic extends Animal {
    @Override
    String move() {
        // TODO Auto-generated method stub
        return "swims";
    }
    @Override
    String sound() {
        // TODO Auto-generated method stub
        return "boop";
    }
    public static void main(String[] args) {
        Aquatic fish = new Aquatic();
        fish.name = "BabyShark";
        String move = fish.move();
        String sound = fish.sound();
        System.out.println("it " + move);
        System.out.println("and it makes this sound: " + sound);
    }

}

