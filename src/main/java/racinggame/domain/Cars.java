package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static final String WINNER_NAME_DELIMITER = ",";
    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
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

    /**
     * 주어진 자동차들에 대한 랜덤 이동을 한다
     */
    public void randomMove() {
        for (Car car : cars) {
            car.randomMove();
        }
    }

    /**
     * 진행상황을 출력하는 문자열을 처리하여 반환한다
     *
     * @return
     */
    public String getProcessString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getProcessString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    /**
     * 가장 position이 큰 자동차를 구하여 자동차 이름을 Cars로 반환한다
     *
     * @return 가장 position이 큰 자동차의 이름
     */
    public Cars getWinners() {
        Position maxPosition = Position.start();
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            maxPosition = getMaxPosition(maxPosition, winners, car);
        }
        return new Cars(winners);
    }

    /**
     * 가장 큰 position을 구하여 반환한다
     *
     * @param maxPosition
     * @param winners
     * @param car
     * @return 가장 큰 position
     */
    private Position getMaxPosition(Position maxPosition, List<Car> winners, Car car) {
        Position position = car.getPosition();
        if (maxPosition.isEqualTo(position)) {
            winners.add(car);
        }
        if (position.isBiggerThan(maxPosition)) {
            winners.clear();
            maxPosition = position;
            winners.add(car);
        }
        return maxPosition;
    }

    /**
     * 우승한 자동차 이름을 구하여 문자열로 만들어 반환한다
     *
     * @return 우승한 자동차 이름을 연결한 문자열
     */
    public String getWinnerString() {
        List<String> winnerName = new ArrayList<>();
        Cars winners = getWinners();
        for (int i = 0; i < winners.size(); i++) {
            winnerName.add(winners.get(i).getName().getCarName());
        }
        return String.join(WINNER_NAME_DELIMITER, winnerName);
    }
}
