package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public Car get(int index) {
        return cars.get(index);
    }

    public int size() {
        return cars.size();
    }

    public void randomMove() {
        for (Car car : cars) {
            car.randomMove();
        }
    }

    public String getProcessString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getProcessString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
