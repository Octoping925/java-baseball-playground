package baseball;

public class BaseballUI {
    public static void printStartMessage() {
        System.out.println(BaseballConstants.START_MESSAGE);
    }

    public static void printSwingInputMessage() {
        System.out.print(BaseballConstants.SWING_INPUT_MESSAGE);
    }

    public static void printEndMessage() {
        System.out.println(BaseballConstants.END_MESSAGE);
    }

    public static void printRestartMessage() {
        System.out.println(BaseballConstants.RESTART_MESSAGE);
    }

    public static void printSwingResult(BaseballJudge judge) {
        System.out.println(judge.toString());
    }
}
