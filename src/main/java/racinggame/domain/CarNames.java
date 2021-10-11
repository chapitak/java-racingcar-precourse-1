package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CarNames {
    public static final String CAR_NAME_DELIMITER = ",";
    private final List<CarName> carNames;

    public CarNames(List<CarName> carNames) {
        this.carNames = carNames;
    }

    /**
     * 문자열을 파싱하여 CarNames 객체를 만들어 반환한다
     * @param carNameInput
     * @return
     */
    public static CarNames parseNames(String carNameInput) {
        String[] splitedCarNames = carNameInput.split(CAR_NAME_DELIMITER);
        List<CarName> carNames = new ArrayList<>();
        for (String splitedCarName : splitedCarNames) {
            carNames.add(CarName
                    .from(splitedCarName));
        }
        return new CarNames(carNames);
    }
}
