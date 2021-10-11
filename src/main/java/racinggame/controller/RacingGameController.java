package racinggame.controller;

import racinggame.domain.CarNames;
import racinggame.service.RacingGameService;
import racinggame.view.RacingGameView;

public class RacingGameController {

    private final RacingGameView racingGameView;
    private final RacingGameService racingGameService;

    public RacingGameController(RacingGameView racingGameConsoleView, RacingGameService racingGameService) {
        this.racingGameView = racingGameConsoleView;
        this.racingGameService = racingGameService;
    }

    public void run() {
        String carNameInput = racingGameView.inputCarNames();
        CarNames carNames = CarNames.parseNames(carNameInput);
        int moveCount = racingGameView.inputMoveCount();
    }
}
