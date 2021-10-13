package racinggame.exception;

public class MoveCountUnderZeroException extends IllegalArgumentException {
    public MoveCountUnderZeroException() {
        super("0 이상의 숫자만 입력할 수 있습니다");
    }
}
