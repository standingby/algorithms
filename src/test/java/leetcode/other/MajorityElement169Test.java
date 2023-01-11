package leetcode.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElement169Test {

  @Test
  public void correct() {
    int[] nums = new int[]{3,2,3};
    int expected = 3;
    int actual = MajorityElement169.majorityElement(nums);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void correctAnotherWay() {
    int[] nums = new int[]{1,2,3,4,1,2,3,4,5,5,2,2,3,3,3,3,3,1,1,1,1,1,2,3,4,5};
    int expected = 3;
    int actual = MajorityElement169.majorityElement(nums);
    Assertions.assertEquals(expected, actual);
  }

}
