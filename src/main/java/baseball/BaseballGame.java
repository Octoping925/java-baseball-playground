package baseball;

import util.Generator;
import util.InputReader;

import static baseball.BaseballUI.*;

public class BaseballGame {
    public void gameStart() throws IllegalArgumentException {
        printStartMessage();
        do {
            game(BaseballSwing.create(Generator.makeRandomAnswer()));
            printRestartMessage();
        } while(InputReader.readRestartCommand().isRestart());
    }

    private void game(BaseballSwing answer) throws IllegalArgumentException {
        boolean isGameEnd;
        do {
            printSwingInputMessage();
            isGameEnd = judge(swing(), answer);
        } while(!isGameEnd);

        printEndMessage();
    }

    private BaseballSwing swing() {
        return InputReader.readSwingNumber();
    }

    private boolean judge(BaseballSwing actual, BaseballSwing expected) throws IllegalArgumentException {
        BaseballJudge judge = actual.compare(expected);
        printSwingResult(judge);
        return judge.isAllCorrect();
    }
}
