package leetcode.math;

import java.util.HashMap;
import java.util.Map;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/roman-to-integer/description/"</a>
 */
@UtilityClass
public class RomanToInteger13 {
  public int romanToInt(String s) {
    Map<Character, Integer> romans = new HashMap<>();
    romans.put('I', 1);
    romans.put('V', 5);
    romans.put('X', 10);
    romans.put('L', 50);
    romans.put('C', 100);
    romans.put('D', 500);
    romans.put('M', 1000);

    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      int current = romans.get(s.charAt(i));
      int next = 0;

      if (i != s.length() - 1) {
        next = romans.get(s.charAt(i + 1));
      }

      switch (current) {
        case 1 -> {
          if (next == 5 || next == 10) {
            i++;
            result += next - current;
          } else {
            result += current;
          }
        }
        case 10 -> {
          if (next == 50 || next == 100) {
            i++;
            result += next - current;
          } else {
            result += current;
          }
        }
        case 100 -> {
          if (next == 500 || next == 1000) {
            i++;
            result += next - current;
          } else {
            result += current;
          }
        }
        default -> result += current;
      }
    }

    return result;
  }
}
