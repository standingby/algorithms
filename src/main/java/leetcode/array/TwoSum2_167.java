package leetcode.array;

import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted"</a>
 */
@UtilityClass
public class TwoSum2_167 {

  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    int[] result = new int[2];

    while (left < right) {
      if (numbers[left] + numbers[right] > target) {
        right--;
      } else if (numbers[left] + numbers[right] < target) {
        left++;
      } else {
        result[0] = left + 1;
        result[1] = right + 1;
        break;
      }
    }

    return result;
  }
}
