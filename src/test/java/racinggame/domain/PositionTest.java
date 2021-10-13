package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.exception.NegativePositionException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositionTest {

    @Test
    @DisplayName("자동차 위치가 음수인 경우 예외를 던진다")
    void fromTest() {
        assertThatThrownBy(() -> {
            // when
            Position position = Position.from(-1);
        })
                // then
                .isInstanceOf(NegativePositionException.class)
                .hasMessageContaining("자동차의 위치는 음수가 될 수 없습니다");
    }
}