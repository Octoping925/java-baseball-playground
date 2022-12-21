import baseball.BaseballGame;

public class Main {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();

        try {
            baseballGame.gameStart();
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
