package leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumber9Test {

  @Test
  public void correct() {
    int x = 121;
    boolean result = PalindromeNumber9.isPalindrome(121);
    Assertions.assertTrue(result);
  }

}
