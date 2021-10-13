package racinggame.domain;

public class MoveCount {
    int moveCount;

    public MoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public static MoveCount from(int moveCount) {
        return new MoveCount(moveCount);
    }

    public int getMoveCount() {
        return moveCount;
    }
}
