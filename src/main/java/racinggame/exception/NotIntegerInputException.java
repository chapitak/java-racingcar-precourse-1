package racinggame.exception;

public class NotIntegerInputException extends IllegalArgumentException {
    public NotIntegerInputException() {
        super("시도할 회수를 정수로 입력해주세요");
    }
}
