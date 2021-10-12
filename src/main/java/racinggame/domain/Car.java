package racinggame.domain;

import nextstep.utils.Randoms;

public class Car {
    public static final int MOVE_CONDITION_THRESHOLD = 4;
    public static final String PROCESS_DELIMITER = " : ";
    public static final String PROGRESS_BAR = "-";
    public static final int START_INCLUSIVE_RANDOM_RANGE = 0;
    public static final int END_INCLUSIVE_RANDOM_RANGE = 9;
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

    public CarName getName() {
        return carName;
    }

    /**
     * moveCondition을 입력받고 조건에 따라 현재 객체의 position을 증가시킨다
     */
    public void move(int moveCondition) {
        if (moveCondition >= MOVE_CONDITION_THRESHOLD) {
            position++;
        }
    }

    /**
     * 주어진 범위 내의 랜덤한 숫자를 입력으로 받아 move 함수에 따른 랜덤한 움직임을 가진다
     */
    public void randomMove() {
        move(Randoms.pickNumberInRange(START_INCLUSIVE_RANDOM_RANGE, END_INCLUSIVE_RANDOM_RANGE));
    }

    /**
     * 자동차 경주 진행상황에 대한 문자열을 반환한다
     *
     * @return
     */
    public String getProcessString() {
        StringBuilder sb = new StringBuilder();
        sb.append(carName.getCarName());
        sb.append(PROCESS_DELIMITER);
        for (int i = 0; i < position; i++) {
            sb.append(PROGRESS_BAR);
        }
        return sb.toString();
    }
}
