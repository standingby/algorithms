package leetcode.math;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzz412Test {

  @Test
  public void correct() {
    int n = 15;
    List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz");
    List<String> result = FizzBuzz412.fizzBuzz(n);
    Assertions.assertLinesMatch(expected, result);
  }
}
