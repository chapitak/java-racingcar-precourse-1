package racinggame.controller;

import racinggame.domain.Cars;
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
        Cars cars = racingGameService.makeCars(carNameInput);
        int moveCount = racingGameView.inputMoveCount();
        for (int i = 0; i < moveCount; i++) {
            String racingProcess = racingGameService.race(cars, moveCount);
        }
    }
}
