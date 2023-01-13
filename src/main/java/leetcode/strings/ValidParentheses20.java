package leetcode.strings;

import java.util.Stack;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidParentheses20 {

  public boolean isValid(String s) {
    Stack<Character> characters = new Stack<>();

    for (char c : s.toCharArray()) {
      if (!characters.isEmpty()) {
        if (c == '(' || c == '{' || c == '[') {
          characters.push(c);
        } else {
          if ((c == ')' && characters.peek() == '(') || (c == ']' && characters.peek() == '[') || (
              c == '}' && characters.peek() == '{')) {
            characters.pop();
          } else {
            return false;
          }
        }
      } else {
        characters.push(c);
      }
    }

    return characters.isEmpty();
  }
}
