package leetcode.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostFrequentEvenElement2404Test {

  @Test
  public void correct() {
    int[] nums = new int[]{0, 1, 2, 2, 4, 4, 1};
    int expected = 2;
    int actual = MostFrequentEvenElement2404.mostFrequentEven(nums);
    Assertions.assertEquals(expected, actual);
  }

}
