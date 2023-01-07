package leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArray189Test {

  @Test
  public void correct() {
    int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    RotateArray189.rotate(nums, k);
  }

}
