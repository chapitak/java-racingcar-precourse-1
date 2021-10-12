package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @Test
    @DisplayName("진행상황을 출력한다")
    void getProcessString() {
        Cars cars = new Cars();
        // given
        Car car1 = Car.from(CarName.from("Car1"));
        Car car2 = Car.from(CarName.from("Car2"));
        // when
        car1.move(4);
        car1.move(4);
        car1.move(4);
        car2.move(0);
        car2.move(1);
        car2.move(9);

        cars.add(car1);
        cars.add(car2);

        // then
        assertThat(cars.getProcessString()).isEqualTo("Car1:---\r\n" +
                "Car2:-" + System.lineSeparator());
    }
}