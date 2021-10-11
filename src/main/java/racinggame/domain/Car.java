package racinggame.domain;

public class Car {
    public static final int MOVE_CONDITION_THRESHOLD = 4;
    private final CarName carName;
    private int position = 0;

    public Car(CarName carName) {
        this.carName = carName;
    }

    /**
     * CarName 객체를 입력받아 Car 객체를 생성하여 반환한다
     *
     * @param carName
     * @return 생성한 Car 객체
     */
    public static Car from(CarName carName) {
        return new Car(carName);
    }

    public int getPosition() {
        return position;
    }

    /**
     * moveCondition을 입력받고 조건에 따라 현재 객체의 position을 증가시킨다
     */
    public void move(int moveCondition) {
        if (moveCondition >= MOVE_CONDITION_THRESHOLD) {
            position++;
        }
    }
}
