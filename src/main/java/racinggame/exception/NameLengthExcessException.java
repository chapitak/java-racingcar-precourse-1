package racinggame.exception;

public class NameLengthExcessException extends IllegalArgumentException {
    public NameLengthExcessException() {
        super("자동차 이름은 5자 이하만 입력 가능합니다");
    }
}
