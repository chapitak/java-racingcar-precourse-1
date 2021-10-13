package racinggame.domain;

import racinggame.exception.MoveCountUnderZeroException;
import racinggame.exception.NotIntegerInputException;

public class MoveCount {
    int moveCount;

    public MoveCount(String moveCountInput) {
        validateInteger(moveCountInput);
        validateUnderZero();
    }

    public static MoveCount from(String moveCountInput) {
        return new MoveCount(moveCountInput);
    }

    private void validateInteger(String moveCountInput) {
        try {
            moveCount = Integer.parseInt(moveCountInput);
        } catch (RuntimeException e) {
            throw new NotIntegerInputException();
        }
    }

    private void validateUnderZero() {
        if (moveCount < 0) {
            throw new MoveCountUnderZeroException();
        }
    }

    public int getMoveCount() {
        return moveCount;
    }
}
