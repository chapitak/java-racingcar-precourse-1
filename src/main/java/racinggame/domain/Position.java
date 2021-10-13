package racinggame.domain;

import racinggame.exception.NegativePositionException;

public class Position {
    public static final int START_POSITION = 0;
    private int position;

    public Position(int position) {
        validatePositionPositive(position);
        this.position = position;
    }

    public static Position from(int position) {
        return new Position(position);
    }

    public static Position start() {
        return new Position(START_POSITION);
    }

    private void validatePositionPositive(int position) {
        if (position < START_POSITION) {
            throw new NegativePositionException();
        }
    }

    public int getPosition() {
        return position;
    }

    public void increase() {
        position++;
    }

    public boolean isBiggerThan(Position position) {
        return this.position > position.getPosition();
    }

    public boolean isEqualTo(Position position) {
        return this.position == position.getPosition();
    }
}
