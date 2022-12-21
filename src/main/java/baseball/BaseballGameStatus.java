package baseball;

import java.util.Arrays;

public enum BaseballGameStatus {
    재시작(BaseballConstants.RESTART_COMMAND),
    종료(BaseballConstants.TERMINATE_COMMAND);

    private final String command;
    BaseballGameStatus(String command) {
        this.command = command;
    }

    public static BaseballGameStatus getByCommand(String value) {
        BaseballGameStatus[] statusArr = BaseballGameStatus.values();

        return Arrays.stream(statusArr)
                .filter(gameStatus -> gameStatus.command.equals(value))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public boolean isRestart() {
        return this == 재시작;
    }
}
