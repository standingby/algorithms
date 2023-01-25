package leetcode.strings;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/reverse-string/"</a>
 */
@UtilityClass
public class ReverseWordsInAString3_557 {

  public String reverseWords(String s) {
    String result = "";

    for (String part : s.split(" ")) {
      int left = 0;
      int right = part.length() - 1;
      char[] chars = part.toCharArray();

      while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
      }

      result += String.valueOf(chars) + " ";
    }

    return result.trim();
  }
}
