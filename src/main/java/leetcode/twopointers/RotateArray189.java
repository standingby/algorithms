package leetcode.twopointers;

import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/rotate-array/description/"</a>
 * */
@UtilityClass
public class RotateArray189 {

  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  private void reverse(int[] input, int start, int end) {
    while (start < end) {
      int temp = input[start];
      input[start] = input[end];
      input[end] = temp;
      start++;
      end--;
    }
  }
}
