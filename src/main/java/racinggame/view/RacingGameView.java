package racinggame.view;

public interface RacingGameView {
    String inputCarNames();

    int inputMoveCount();

    void printProcessHeader();

    void printRaceProcess(String processString);

    void printWinner(String winnerString);

    void printErrorMessage(String message);
}
