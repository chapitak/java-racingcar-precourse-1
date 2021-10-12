package racinggame.service;

import racinggame.domain.Car;
import racinggame.domain.CarNames;
import racinggame.domain.Cars;

import java.util.ArrayList;

public class RacingGameService {

    public void race(Cars cars) {
        cars.randomMove();
    }

    /**
     * 사용자로부터 입력받은 문자열로 자동차 객체를 생성하여 반환한다
     *
     * @param carNameInput
     * @return 생성한 자동차 객체
     */
    public Cars makeCars(String carNameInput) {
        CarNames carNames = CarNames.parseNames(carNameInput);
        Cars cars = new Cars(new ArrayList<>());
        for (int i = 0; i < carNames.size(); i++) {
            cars.add(Car.from(carNames.get(i)));
        }
        return cars;
    }
}
