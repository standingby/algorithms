package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum2_167Test {

  @Test
  public void correct() {
    int[] numbers = new int[]{2, 7, 11, 15};
    int target = 9;
    int[] expected = new int[]{1,2};
    int[] actual = TwoSum2_167.twoSum(numbers, target);
    Assertions.assertArrayEquals(expected, actual);
  }
}
