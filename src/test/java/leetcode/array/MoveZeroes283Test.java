package leetcode.array;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class MoveZeroes283Test {

  @Test
  public void correct() {
    int[] nums = new int[]{0, 1, 0, 3, 12};
    MoveZeroes283.moveZeroes(nums);
    int[] expected = new int[]{1, 3, 12, 0, 0};
    Assertions.assertArrayEquals(expected, nums);
  }

  @Test
  public void correct2() {
    int[] nums = new int[]{0, 1, 0, 3, 12, 0, 132, 22, 0, 0, -1, 4, 0};
    MoveZeroes283.moveZeroes(nums);
    int[] expected = new int[]{1, 3, 12, 132, 22, -1, 4, 0, 0, 0, 0, 0, 0};
    Assertions.assertArrayEquals(expected, nums);
  }

  @Test
  public void correct3() {
    int[] nums = new int[]{1, 0};
    MoveZeroes283.moveZeroes(nums);
    int[] expected = new int[]{1, 0};
    Assertions.assertArrayEquals(expected, nums);
  }

  @Test
  public void correct4() {
    int[] nums = new int[]{1, 0, 0, 3, 12};
    MoveZeroes283.moveZeroes(nums);
    int[] expected = new int[]{1, 3, 12, 0, 0};
    Assertions.assertArrayEquals(expected, nums);
  }

  @Test
  public void correct5() {
    int[] nums = new int[]{2, 1};
    MoveZeroes283.moveZeroes(nums);
    int[] expected = new int[]{2, 1};
    Assertions.assertArrayEquals(expected, nums);
  }

  @Test
  public void correct6() {
    int[] nums = new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
    MoveZeroes283.moveZeroes(nums);
    log.info(Arrays.toString(nums));
    int[] expected = new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0};
    Assertions.assertArrayEquals(expected, nums);
  }

}
