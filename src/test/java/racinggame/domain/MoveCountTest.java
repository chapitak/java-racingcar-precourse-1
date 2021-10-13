package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.exception.NegativeMoveCountException;
import racinggame.exception.NotIntegerInputException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MoveCountTest {

    @Test
    @DisplayName("0 이하의 정수를 입력하면 예외를 던진다")
    void validateUnderZeroTest() {
        assertThatThrownBy(() -> {
            // when
            MoveCount.from("-1");
        })
                // then
                .isInstanceOf(NegativeMoveCountException.class)
                .hasMessageContaining("0 이상의 숫자만 입력할 수 있습니다");
    }

    @Test
    @DisplayName("정수 외의 값을 입력하면 예외를 던진다")
    void validateTest() {
        assertThatThrownBy(() -> {
            // when
            MoveCount.from("김정교");
        })
                // then
                .isInstanceOf(NotIntegerInputException.class)
                .hasMessageContaining("시도할 회수를 정수로 입력해주세요");
    }
}