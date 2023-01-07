package leetcode.math;

import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/description/"</a>
 * */
@UtilityClass
public class PalindromeNumber9 {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int rem, rev = 0, temp = x;
    while (x != 0) {
      rem = x % 10;
      rev = rev * 10 + rem;
      x = x / 10;
    }

    return temp == rev;
  }

}
