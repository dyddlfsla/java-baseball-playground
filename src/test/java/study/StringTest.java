package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringTest {

  @Test
  @DisplayName("replace 테스트")
  void replace() {
    String actual = "abc".replace("b", "d");
    assertThat(actual).isEqualTo("adc");
  }

  @Test
  @DisplayName("',' 을 매개변수로 한 split() 메서드를 문자열 \"1,2\" 에 사용하면 1과 2로 분리된다.")
  void splitString() {
    //given
    String target = "1,2";
    //when
    String[] result = target.split(",");
    //then
    assertThat(result).contains("1", "2");
    assertThat(result).containsExactly("1", "2");
  }

  @Test
  @DisplayName("',' 을 매개변수로 한 split() 메서드를 문자열 \"1\" 을 에 사용하면 1만 포함하는 배열이 된다.")
  void splitSingleString() {
    //given
    String target = "1";
    //when
    String[] result = target.split(",");
    //then
    assertThat(result).contains("1");
    assertThat(result).containsExactly("1");
  }

  @Test
  @DisplayName("문자열 \"(1,2)\" 에 subString() 메서드를 사용하면 ()가 제거된 \"1,2\"를 얻을 수 있다.")
  void subString() {
    //given
    String target = "(1,2)";
    //when
    String result = target.substring(1, 4);
    //then
    assertThat(result).contains("1,2");
    assertThat(result).isEqualTo("1,2");
  }

  @ParameterizedTest(name = "문자열 \"abc\"에 charAt() 메서드를 사용하면 특정 위치의 문자를 찾을 수 있다.")
  @CsvSource(value ={"0:a", "1:b", "2:c"}, delimiter = ':')
  void charAt(int index, char expected) {
    //given
    String target = "abc";
    //when
    char result = target.charAt(index);
    //then
    assertThat(result).isEqualTo(expected);
  }

  @ParameterizedTest(name = "문자를 찾을 때 위치 값이 문자열이 가진 범위를 벗어나면 StringIndexOutOfBoundsException 예외가 발생한다.")
  @ValueSource(ints = {-1, 3})
  void chatAtThrowsException(int index) {
    //given
    String target = "abc";
    //then
    assertThatThrownBy(() -> target.charAt(index))
        .isInstanceOf(StringIndexOutOfBoundsException.class);
  }
}
