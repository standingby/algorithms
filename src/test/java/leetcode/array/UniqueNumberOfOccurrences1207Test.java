package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueNumberOfOccurrences1207Test {

  @Test
  public void correct() {
    int[] arr = new int[]{1, 2, 2, 1, 1, 3};
    boolean result = UniqueNumberOfOccurrences1207.uniqueOccurrences(arr);
    Assertions.assertTrue(result);
  }

}
