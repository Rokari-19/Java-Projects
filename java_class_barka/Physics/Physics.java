package java_class_barka.Physics;

public class Physics {

    int time;
    float distance, initialVelocity, acceleration;
    // first
    float calculateVelocity(float distance, int time) {
        return distance/time;
    }

    float calculateVelocity(float initialVelocity, float acceleration, int time) {
        return initialVelocity + (distance * time);
    }

    public static void main(String[] args) {
        Physics physics = new Physics();
        float vel_1 = physics.calculateVelocity(25, 200);
        float vel_2 = physics.calculateVelocity(50, 41, 200);

        System.out.println(vel_1);
        System.out.println(vel_2);
    }
}
