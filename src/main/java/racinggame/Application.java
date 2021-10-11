package racinggame;

import racinggame.controller.RacingGameController;
import racinggame.service.RacingGameService;
import racinggame.view.RacingGameConsoleView;

public class Application {
    public static void main(String[] args) {
        RacingGameService racingGameService = new RacingGameService();
        RacingGameController racingGameController = new RacingGameController(new RacingGameConsoleView(), racingGameService);
        racingGameController.run();
    }
}
