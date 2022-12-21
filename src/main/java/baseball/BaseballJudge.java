package baseball;

public class BaseballJudge {
    private final int strike;
    private final int ball;

    public BaseballJudge(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    @Override
    public String toString() {
        if(this.strike == 0 && this.ball == 0) {
            return "낫싱";
        }

        StringBuilder sb = new StringBuilder();
        if(this.ball > 0) {
            sb.append(String.format("%d볼 ", this.ball));
        }
        if(this.strike > 0) {
            sb.append(String.format("%d스트라이크", this.strike));
        }

        return sb.toString();
    }

    public boolean isAllCorrect() {
        return this.strike == BaseballSwing.LENGTH;
    }
}
