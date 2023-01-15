package leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToInteger13Test {

  @Test
  public void correct() {
    String s = "III";
    int expected = 3;
    int actual = RomanToInteger13.romanToInt(s);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void correct2() {
    String s = "MCMXCIV";
    int expected = 1994;
    int actual = RomanToInteger13.romanToInt(s);
    Assertions.assertEquals(expected, actual);
  }

}
