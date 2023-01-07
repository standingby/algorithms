package leetcode.strings;

import java.util.Arrays;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/valid-anagram/description/"</a>
 * */
@UtilityClass
public class ValidAnagram242 {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    Arrays.sort(sArray);
    Arrays.sort(tArray);

    for (int i = 0; i < s.length() - 1; i++) {
      System.out.println(sArray[i] + " " + tArray[i]);
      if (sArray[i] != tArray[i]) {
        return false;
      }
    }

    return true;
  }

}
