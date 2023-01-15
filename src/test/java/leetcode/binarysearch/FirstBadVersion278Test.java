package leetcode.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstBadVersion278Test {

  @Test
  public void correct() {
    int n = 5;
    int bad = 4;
    int result = FirstBadVersion278.firstBadVersion(n, bad);
    Assertions.assertEquals(4, result);
  }

}
