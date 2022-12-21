package util;

import baseball.BaseballSwing;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public final class Generator {
    private static final Random random = new Random();
    public static int makeRandomNumber() {
        return random.nextInt(9) + 1;
    }

    public static String makeRandomAnswer() {
        Set<Integer> nums = new LinkedHashSet<>();

        while(nums.size() < BaseballSwing.LENGTH) {
            nums.add(makeRandomNumber());
        }

        StringBuilder sb = new StringBuilder();
        for(Integer num : nums) {
            sb.append(num);
        }

        return sb.toString();
    }
}
