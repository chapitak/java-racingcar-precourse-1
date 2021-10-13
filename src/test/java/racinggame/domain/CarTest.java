package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarTest {

    @ParameterizedTest
    @CsvSource(value = {"0:0", "1:0", "2:0", "3:0", "4:1", "5:1", "6:1", "7:1", "8:1", "9:1"}, delimiter = ':')
    @DisplayName("4 이상의 정수를 입력받으면 전진하고 3이하의 정수을 입력받으면 멈춘다")
    void moveTest(Integer moveCondition, Integer position) {
        // given
        Car car1 = Car.from(CarName.from("Car1"));

        // when
        car1.move(moveCondition);

        // then
        assertThat(car1.getPosition().isEqualTo(Position.from(position))).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"5;Car1 : -"}, delimiter = ';')
    @DisplayName("진행상황을 출력한다")
    void getProcessString(Integer moveCondition, String processString) {
        // given
        Car car1 = Car.from(CarName.from("Car1"));

        // when
        car1.move(moveCondition);

        // then
        assertThat(car1.getProcessString()).isEqualTo(processString);
    }
}