package leetcode.binarysearch;

import lombok.experimental.UtilityClass;

@UtilityClass
public class BinarySearch704 {

  public int search(int[] nums, int target) {
    int l = 0;
    int h = nums.length - 1;
    int index = -1;

    while (l <= h) {
      int m = l + ((h - l) / 2);

      if (nums[m] < target) {
        l = m + 1;
      } else if (nums[m] > target) {
        h = m - 1;
      } else if (nums[m] == target) {
        index = m;
        break;
      }
    }

    return index;
  }
}
