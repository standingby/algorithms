package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsInAString3_557Test {

  @Test
  public void correct() {
    String s = "Let's take LeetCode contest";
    String expected = "s'teL ekat edoCteeL tsetnoc";
    String actual = ReverseWordsInAString3_557.reverseWords(s);
    Assertions.assertEquals(expected, actual);
  }

}
