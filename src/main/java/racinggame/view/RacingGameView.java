package racinggame.view;

import racinggame.domain.Cars;

public interface RacingGameView {
    String inputCarNames();

    int inputMoveCount();

    void printProcessHeader();

    void printRaceProcess(String processString);
}
