package util;

import baseball.BaseballSwing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {
    @Test
    void makeRandomNumber() {
        for(int i = 0; i < 100; ++i) {
            int randomNum = Generator.makeRandomNumber();
            assertTrue(0 < randomNum && randomNum < 10);
        }
    }

    @Test
    void makeRandomAnswer() {
        String answer = Generator.makeRandomAnswer();
        System.out.println(answer);
        assertEquals(BaseballSwing.LENGTH, answer.length());
        assertFalse(Validator.containsDuplicateNumber(answer));
    }
}