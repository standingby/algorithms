package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicate217Test {

  @Test
  public void correct() {
    int[] nums = new int[]{1, 2, 3, 4, 1};
    boolean actual = ContainsDuplicate217.containsDuplicateHashMap(nums);
    Assertions.assertTrue(actual);
  }

  @Test
  public void correct2() {
    int[] nums = new int[]{1, 2, 3, 4, 1};
    boolean actual = ContainsDuplicate217.containsDuplicateHashSet(nums);
    Assertions.assertTrue(actual);
  }

}
