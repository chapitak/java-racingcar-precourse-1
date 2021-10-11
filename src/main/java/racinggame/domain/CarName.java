package racinggame.domain;

import racinggame.exception.NameLengthExcessException;

public class CarName {
    public static final int CARNAME_THRESHOLD = 5;
    private final String carName;

    /**
     * CarName객체를 생성한다
     *
     * @param carName
     */
    public CarName(String carName) {
        checkNameLength(carName);
        this.carName = carName;
    }

    /**
     * 문자열을 입력받아 CarName객체를 생성하여 반환한다
     *
     * @param carName
     * @return 생성한 CarName객체
     */
    public static CarName from(String carName) {
        return new CarName(carName);
    }

    /**
     * 문자열을 입력받아 5자를 초과하면 예외를 던진다
     *
     * @param carName
     */
    private void checkNameLength(String carName) {
        if (carName.length() > CARNAME_THRESHOLD) {
            throw new NameLengthExcessException();
        }
    }
}
