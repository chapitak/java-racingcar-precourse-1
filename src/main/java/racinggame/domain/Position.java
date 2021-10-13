package racinggame.domain;

import racinggame.exception.NegativePositionException;

public class Position {
    public static final int START_POSITION = 0;
    private int position;

    public Position(int position) {
        validatePositionPositive(position);
        this.position = position;
    }

    /**
     * position을 int로 입력받아 Position 객체를 반환하는 정적 팩토리 메서드다
     *
     * @param position
     * @return 생성한 Position 객체
     */
    public static Position from(int position) {
        return new Position(position);
    }

    /**
     * Position을 게임에서 처음 시작할 때 생성해주는 정적 팩토리 메서드다
     *
     * @return
     */
    public static Position start() {
        return new Position(START_POSITION);
    }

    /**
     * 정수 position을 입력받아 양수인지 검증하여 음수일 경우 예외를 출력한다
     *
     * @param position
     */
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
