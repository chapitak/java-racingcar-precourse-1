package racinggame.exception;

public class NegativePositionException extends RuntimeException {
    public NegativePositionException() {
        super("자동차의 위치는 음수가 될 수 없습니다");
    }
}
