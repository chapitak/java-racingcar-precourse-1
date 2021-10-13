package racinggame.view;

import nextstep.utils.Console;

public class RacingGameConsoleView implements RacingGameView {

    public static final String MESSAGE_INPUT_CARNAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)";
    public static final String MESSAGE_INPUT_MOVECOUNT = "시도할 회수는 몇회인가요?";
    public static final String MESSAGE_PROCESS_HEADER = "실행 결과";
    public static final String HEADER_ERROR = "[ERROR] ";
    public static final String MESSAGE_WINNER_1 = "최종 우승자는 ";
    public static final String MESSAGE_WINNER_2 = " 입니다.";

    @Override
    public String inputCarNames() {
        System.out.println(MESSAGE_INPUT_CARNAMES);
        return Console.readLine();
    }

    @Override
    public String inputMoveCount() {
        System.out.println(MESSAGE_INPUT_MOVECOUNT);
        return Console.readLine();
    }

    @Override
    public void printProcessHeader() {
        System.out.println(MESSAGE_PROCESS_HEADER);
    }

    @Override
    public void printRaceProcess(String process) {
        System.out.println(process);
    }

    @Override
    public void printWinner(String winnerString) {
        System.out.println(MESSAGE_WINNER_1 + winnerString + MESSAGE_WINNER_2);
    }

    @Override
    public void printErrorMessage(String message) {
        System.out.println(HEADER_ERROR + message);
    }
}
