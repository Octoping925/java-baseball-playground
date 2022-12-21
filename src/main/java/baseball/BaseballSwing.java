package baseball;

import util.Validator;

import java.util.HashMap;
import java.util.Map;

public class BaseballSwing {
    public static final int LENGTH = 3;
    private final String number;

    private BaseballSwing(String inputStr) {
        this.number = inputStr;
    }

    public static BaseballSwing create(String inputStr) {
        if(!isValidAnswer(inputStr)) {
            throw new IllegalArgumentException();
        }

        return new BaseballSwing(inputStr);
    }

    public BaseballJudge compare(BaseballSwing expected) {
        Map<Character, Integer> expectedNum = new HashMap<>();

        for(int i = 0; i < LENGTH; ++i) {
            expectedNum.put(expected.number.charAt(i), i);
        }

        int strike = 0;
        int ball = 0;

        for(int i = 0; i < LENGTH; ++i) {
            char c = this.number.charAt(i);

            if(expectedNum.containsKey(c) && expectedNum.get(c) == i) {
                strike++;
            }
            else if(expectedNum.containsKey(c)) {
                ball++;
            }
        }

        return new BaseballJudge(strike, ball);
    }

    private static boolean isValidAnswer(String inputStr) {
        if(inputStr.length() != LENGTH) {
            return false;
        }
        if(!Validator.isNumeric(inputStr)) {
            return false;
        }
        if(Validator.containsDuplicateNumber(inputStr)) {
            return false;
        }

        return true;
    }
}
