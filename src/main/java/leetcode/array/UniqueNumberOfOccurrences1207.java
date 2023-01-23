package leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/unique-number-of-occurrences/"</a>
 */
@UtilityClass
public class UniqueNumberOfOccurrences1207 {

  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> nums = new HashMap<>();
    for (int num : arr) {
      int current = nums.getOrDefault(num, 0) + 1;
      nums.put(num, current);
    }

    Set<Integer> occurrences = new HashSet<>(nums.values());
    return occurrences.size() == nums.size();
  }

}
