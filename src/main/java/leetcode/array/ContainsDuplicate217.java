package leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate/description//"</a>
 */
@UtilityClass
public class ContainsDuplicate217 {

  public boolean containsDuplicateHashMap(int[] nums) {
    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int num : nums) {
      int current = numsMap.getOrDefault(num, 0) + 1;
      numsMap.put(num, current);
      if (numsMap.get(num) > 1) {
        return true;
      }
    }

    return false;
  }

  public boolean containsDuplicateHashSet(int[] nums) {
    Set<Integer> numsSet = new HashSet<>();

    for (int num : nums) {
      if (numsSet.contains(num)) {
        return true;
      }
      numsSet.add(num);
    }

    return false;
  }

}
