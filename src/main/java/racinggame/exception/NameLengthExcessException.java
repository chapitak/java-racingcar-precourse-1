package racinggame.exception;

import java.util.NoSuchElementException;

public class NameLengthExcessException extends NoSuchElementException {
    public NameLengthExcessException() {
        super("자동차 이름은 5자 이하만 입력 가능합니다");
    }
}
