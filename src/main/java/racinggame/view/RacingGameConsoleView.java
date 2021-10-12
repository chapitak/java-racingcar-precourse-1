package racinggame.view;

import nextstep.utils.Console;
import racinggame.exception.NotIntegerInputException;

public class RacingGameConsoleView implements RacingGameView {

    @Override
    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        return Console.readLine();
    }

    @Override
    public int inputMoveCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int moveCount;
        try {
            moveCount = Integer.parseInt(Console.readLine());
        } catch (RuntimeException e) {
            throw new NotIntegerInputException();
        }
        return moveCount;
    }

    @Override
    public void printProcessHeader() {
        System.out.println("실행 결과");
    }

    @Override
    public void printRaceProcess(String process) {
        System.out.println(process);
    }

    @Override
    public void printWinner(String winnerString) {
        System.out.println("최종 우승자는 " + winnerString + " 입니다.");
    }
}
