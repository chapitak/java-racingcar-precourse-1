package racinggame.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.domain.Cars;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RacingGameServiceTest {

    @Test
    @DisplayName("쉼표로 분리된 문자열을 입력받아 자동차를 생성한다")
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