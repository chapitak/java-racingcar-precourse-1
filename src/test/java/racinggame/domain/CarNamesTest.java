package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarNamesTest {

    @Test
    @DisplayName("쉼표로 분리된 문자열을 입력받아 자동차를 생성한다")
    void parseNames() {
        CarNames carNamesTarget = CarNames.parseNames("김,정,교");
        String[] carNames = {"김", "정", "교"};
        List<CarName> carNamesList = new ArrayList<>();
        for (String carName : carNames) {
            carNamesList.add(CarName
                    .from(carName));
        }
        assertThat(carNamesTarget).usingRecursiveComparison().isEqualTo(new CarNames(carNamesList));
    }
}