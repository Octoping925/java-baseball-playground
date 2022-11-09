package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] splitResult = "1,2".split(",");
        assertThat(splitResult).contains("1", "2");

        String[] splitResult2 = "1".split(",");
        assertThat(splitResult2).containsExactly("1");
    }

    String substring() {
        return "(1,2)".substring(1, 4);
    }

    @Test
    void charAt() {
        char c = "abc".charAt(0);
        assertThat(c).isEqualTo('c');
    }

    @Test
    @DisplayName("charAt으로 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생")
    void charAt_FAIL() {
        assertThatThrownBy(() -> {
           "abc".charAt(99);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
        .hasMessageContaining("String index out of range: 99");
    }
}
