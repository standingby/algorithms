package leetcode.binarysearch;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SearchInsertPosition35 {
  public int searchInsert(int[] nums, int target) {
    int temp = -1;
    for (int i = 0; i < nums.length; i++) {
      if (target <= nums[i]) {
        temp = i;
        break;
      }
      temp = nums.length;
    }
    return temp;
  }
}
