package leetcode.strings;

import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/"</a>
 */
@UtilityClass
public class LongestCommonPrefix14 {

  public String longestCommonPrefix(String[] strs) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < strs[0].length(); i++) {
      for (String s : strs) {
        if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
          return result.toString();
        }
      }
      result.append(strs[0].charAt(i));
    }

    return result.toString();
  }
}
