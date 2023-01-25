package leetcode.array;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes"</a>
 */
@Slf4j
@UtilityClass
public class MoveZeroes283 {

  public void moveZeroes(int[] nums) {
    int left = 0;
    int right = 1;
    int temp;

    while (right < nums.length) {
      if (nums[left] == 0 && nums[right] == 0) {
        right++;
      } else if (nums[left] == 0) {
        temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
        left++;
        right++;
      } else {
        right++;
        left++;
      }
    }
  }
}
