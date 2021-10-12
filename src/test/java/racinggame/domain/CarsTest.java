package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarsTest {
    Cars cars = new Cars(new ArrayList<>());

    @Test
    @DisplayName("진행상황을 출력한다")
    void getProcessString() {

        // then
        assertThat(cars.getProcessString()).isEqualTo("Car1 : ---\r\n" +
                "Car2 : -\r\n" +
                "Car3 : " + System.lineSeparator());
    }

    @Test
    @DisplayName("우승자가 한 명일때 우승자를 구한다")
    void getWinnerTest1() {
        Cars winners = cars.getWinners();
        assertThat(winners.get(0)
                .getName()
                .getCarName())
                .isEqualTo("Car1");
    }

    @Test
    @DisplayName("우승자가 두 명일때 우승자를 구한다")
    void getWinnerTest2() {
        Car car4 = Car.from(CarName.from("Car4"));
        car4.move(9);
        car4.move(9);
        car4.move(9);
        cars.add(car4);
        Cars winners = cars.getWinners();
        assertThat(winners.get(0)
                .getName()
                .getCarName())
                .isEqualTo("Car1");
        assertThat(winners.get(1)
                .getName()
                .getCarName())
                .isEqualTo("Car4");
    }

    @BeforeEach
    void setUp() {
        // given
        Car car1 = Car.from(CarName.from("Car1"));
        Car car2 = Car.from(CarName.from("Car2"));
        Car car3 = Car.from(CarName.from("Car3"));
        // when
        car1.move(4);
        car1.move(4);
        car1.move(4);
        car2.move(9);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }
}