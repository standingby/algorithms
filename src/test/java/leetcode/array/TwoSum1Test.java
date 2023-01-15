package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum1Test {

  @Test
  public void correct() {
    int[] nums = new int[]{2, 7, 11, 15};
    int target = 9;
    int[] expected = new int[]{0, 1};
    int[] result = TwoSum1.twoSum(nums, target);
    Assertions.assertArrayEquals(expected, result);
  }

}
