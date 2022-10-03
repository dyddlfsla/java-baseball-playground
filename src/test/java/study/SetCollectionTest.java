package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetCollectionTest {

  private Set<Integer> numbers;

  @BeforeEach
  void setUp() {
    numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  @Test
  @DisplayName("size 메서드로 Set 의 크기를 확인한다.")
  void size() {
    //when
    int sizeOfNumbers = numbers.size();
    //then
    assertThat(sizeOfNumbers).isEqualTo(3);
  }

  @ParameterizedTest(name = "contains 메서드로  1, 2, 3의 값이 존재하는지 확인한다.")
  @ValueSource(ints = {1, 2, 3})
  void contains(int target) {
    //then
    assertThat(numbers).contains(target);
  }

  @ParameterizedTest(name = "결과에 상관없이 테스트가 가능하다.")
  @CsvSource(value = {"1:true","2:true","3:true","4:false","5:false"}, delimiter = ':')
  void containsWithParameterized(int target, boolean expected) {
    //when
    boolean isTargetExists = numbers.contains(target);
    //then
    assertEquals(isTargetExists, expected);
  }
}
