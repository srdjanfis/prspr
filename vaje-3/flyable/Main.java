// Main.java
// Class Main

public class Main {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};

        for (Flyable obj : flyingObjects) {
            obj. fly_obj();
        }
    }
}
