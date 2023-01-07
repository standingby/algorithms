package leetcode.math;

import java.util.ArrayList;
import java.util.List;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/fizz-buzz/description/"</a>
 */
@UtilityClass
public class FizzBuzz412 {

  public List<String> fizzBuzz(int n) {
    boolean fb, f, b;
    List<String> result = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      f = i % 3 == 0;
      b = i % 5 == 0;
      fb = f && b;
      if (fb) {
        result.add("FizzBuzz");
      } else if (f) {
        result.add("Fizz");
      } else if (b) {
        result.add("Buzz");
      } else {
        result.add(String.valueOf(i));
      }
    }

    return result;
  }

}
