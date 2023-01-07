package leetcode.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearch704Test {

  @Test
  public void correct() {
    int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
    int target = 9;
    int result = BinarySearch704.search(nums, target);
    Assertions.assertEquals( 4, result);
  }

}
