package racinggame.domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public static Car from(String name) {
        return new Car(name);
    }

    public int getPosition() {
        return position;
    }

    public void move(int moveCondition) {
        if (moveCondition >= 4) {
            position++;
        }
    }
}
