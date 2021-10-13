package racinggame.domain;

import racinggame.exception.NegativeMoveCountException;
import racinggame.exception.NotIntegerInputException;

public class MoveCount {
    int moveCount;

    public MoveCount(String moveCountInput) {
        validateInteger(moveCountInput);
        validateUnderZero();
    }

    /**
     * 시도횟수를 문자열로 입력받아 MoveCount 객체를 생성하여 반환하는 정적 팩토리 메서드다
     *
     * @param moveCountInput
     * @return 생성된 MoveCount 객체
     */
    public static MoveCount from(String moveCountInput) {
        return new MoveCount(moveCountInput);
    }

    /**
     * 입력받은 moveCountInput을 파싱해서 프로퍼티로 대입하고, 정수가 아닐 경우 예외를 던진다
     *
     * @param moveCountInput
     */
    private void validateInteger(String moveCountInput) {
        try {
            moveCount = Integer.parseInt(moveCountInput);
        } catch (RuntimeException e) {
            throw new NotIntegerInputException();
        }
    }

    /**
     * 프로퍼티가 0보다 작은지 검증하여 참이면 예외를 던진다
     */
    private void validateUnderZero() {
        if (moveCount < 0) {
            throw new NegativeMoveCountException();
        }
    }

    public int getMoveCount() {
        return moveCount;
    }
}
