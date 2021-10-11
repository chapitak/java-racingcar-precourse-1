package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.exception.NameLengthExcessException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @Test
    @DisplayName("길이가 6 이상의 String을 입력했을 때 예외를 출력한다")
    void nameLengthTest() {
        assertThatThrownBy(() -> {
            // when
            CarName.from("123456");
        })
                // then
                .isInstanceOf(NameLengthExcessException.class)
                .hasMessageContaining("자동차 이름은 5자 이하만 입력 가능합니다");
    }
}