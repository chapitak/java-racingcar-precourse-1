package racinggame.controller;

import racinggame.domain.Cars;
import racinggame.service.RacingGameService;
import racinggame.view.RacingGameView;

import java.util.Optional;

public class RacingGameController {

    private final RacingGameView racingGameView;
    private final RacingGameService racingGameService;

    public RacingGameController(RacingGameView racingGameConsoleView, RacingGameService racingGameService) {
        this.racingGameView = racingGameConsoleView;
        this.racingGameService = racingGameService;
    }

    public void run() {
        Cars cars = getCars();
        int moveCount = getMoveCount();
        racingGameView.printProcessHeader();
        for (int i = 0; i < moveCount; i++) {
            racingGameService.race(cars);
            racingGameView.printRaceProcess(cars.getProcessString());
        }
        racingGameView.printWinner(cars.getWinnerString());
    }

    private int getMoveCount() {
        int moveCount = -1;
        while (!(moveCount >= 0)) {
            moveCount = getMoveCountTry();
        }
        return moveCount;
    }

    private int getMoveCountTry() {
        int moveCount = -1;
        try {
            moveCount = racingGameView.inputMoveCount();
        } catch (RuntimeException e) {
            racingGameView.printErrorMessage(e.getMessage());
        }
        return moveCount;
    }

    private Cars getCars() {
        Optional<Cars> cars = Optional.empty();
        while (!cars.isPresent()) {
            cars = getCarsTry();
        }
        return cars.get();
    }

    private Optional<Cars> getCarsTry() {
        try {
            String carNameInput = racingGameView.inputCarNames();
            return Optional.of(racingGameService.makeCars(carNameInput));
        } catch (IllegalArgumentException e) {
            racingGameView.printErrorMessage(e.getMessage());
            return Optional.empty();
        }
    }
}
