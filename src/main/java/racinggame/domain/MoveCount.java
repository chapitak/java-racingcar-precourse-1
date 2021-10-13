package racinggame.domain;

import racinggame.exception.MoveCountUnderZeroException;

public class MoveCount {
    int moveCount;

    public MoveCount(int moveCount) {
        validateUnderZero(moveCount);
        this.moveCount = moveCount;
    }

    public static MoveCount from(int moveCount) {
        return new MoveCount(moveCount);
    }

    private void validateUnderZero(int moveCount) {
        if (moveCount < 0) {
            throw new MoveCountUnderZeroException();
        }
    }

    public int getMoveCount() {
        return moveCount;
    }
}
