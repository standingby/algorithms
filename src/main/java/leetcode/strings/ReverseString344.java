package leetcode.strings;

import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/reverse-string/"</a>
 */
@UtilityClass
public class ReverseString344 {

  public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;
    char temp;

    while (left < right){
      temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      left++;
      right--;
    }
  }
}
