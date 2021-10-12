package racinggame.service;

import org.junit.jupiter.api.Test;
import racinggame.domain.Car;
import racinggame.domain.Cars;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingGameServiceTest {

    @Test
    void makeCars() {
        // given
        RacingGameService racingGameService = new RacingGameService();
        String inputString = "김정교,우테캠";
        Cars cars = racingGameService.makeCars(inputString);
        String[] strings = {"김정교", "우테캠"};

        // when, then
        for (int i = 0; i < cars.size(); i++) {
            assertThat(cars.get(i).getName().getCarName()).isEqualTo(strings[i]);
        }
    }
}