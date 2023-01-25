package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseString344Test {

  @Test
  public void correct() {
    char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
    ReverseString344.reverseString(s);
    char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
    Assertions.assertArrayEquals(expected, s);
  }

  @Test
  public void correct2() {
    char[] s = new char[]{'S', 'a', 'n', 'a', 't'};
    ReverseString344.reverseString(s);
    char[] expected = new char[]{'t', 'a', 'n', 'a', 'S'};
    Assertions.assertArrayEquals(expected, s);
  }

  @Test
  public void correct3() {
    char[] s = new char[]{'a', 's', 'd', 'f', 'g', 'h'};
    ReverseString344.reverseString(s);
    char[] expected = new char[]{'h', 'g', 'f', 'd', 's', 'a'};
    Assertions.assertArrayEquals(expected, s);
  }

}
