package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefix14Test {

  @Test
  public void correct() {
    String[] strs = new String[]{"flower", "flow", "flight"};
    String expected = "fl";
    String actual = LongestCommonPrefix14.longestCommonPrefix(strs);
    Assertions.assertEquals(expected, actual);
  }

}
