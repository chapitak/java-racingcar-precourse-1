package racinggame.service;

import racinggame.domain.Car;
import racinggame.domain.CarNames;
import racinggame.domain.Cars;

public class RacingGameService {

    public void race(Cars cars) {
        cars.randomMove();
    }

    public Cars makeCars(String carNameInput) {
        CarNames carNames = CarNames.parseNames(carNameInput);
        Cars cars = new Cars();
        for (int i = 0; i < carNames.size(); i++) {
            cars.add(Car.from(carNames.get(i)));
        }
        return cars;
    }
}
