package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParentheses20Test {

  @Test
  public void correct() {
    String s = "(){}[]";
    boolean result = ValidParentheses20.isValid(s);
    Assertions.assertTrue(result);
  }

  @Test
  public void correct2() {
    String s = "([])";
    boolean result = ValidParentheses20.isValid(s);
    Assertions.assertTrue(result);
  }

  @Test
  public void incorrect() {
    String s = "([)]";
    boolean result = ValidParentheses20.isValid(s);
    Assertions.assertFalse(result);
  }

  @Test
  public void incorrect2() {
    String s = "[";
    boolean result = ValidParentheses20.isValid(s);
    Assertions.assertFalse(result);
  }

  @Test
  public void incorrect3() {
    String s = "[](";
    boolean result = ValidParentheses20.isValid(s);
    Assertions.assertFalse(result);
  }

  @Test
  public void incorrect4() {
    String s = "(((";
    boolean result = ValidParentheses20.isValid(s);
    Assertions.assertFalse(result);
  }

}
