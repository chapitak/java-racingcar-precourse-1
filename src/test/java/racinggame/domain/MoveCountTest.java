package racinggame.domain;

import org.junit.jupiter.api.Test;
import racinggame.exception.MoveCountUnderZeroException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MoveCountTest {

    @Test
    void fromTest() {
        assertThatThrownBy(() -> {
            // when
            MoveCount.from(-1);
        })
                // then
                .isInstanceOf(MoveCountUnderZeroException.class)
                .hasMessageContaining("0 이상의 숫자만 입력할 수 있습니다");
    }
}