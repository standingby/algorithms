package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagram242Test {

  @Test
  public void correct() {
    String s = "anagram";
    String t = "nagaram";
    boolean result = ValidAnagram242.isAnagram(s, t);
    Assertions.assertTrue(result);
  }

}
