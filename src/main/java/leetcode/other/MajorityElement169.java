package leetcode.other;

import java.util.HashMap;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MajorityElement169 {

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> numsMap = new HashMap<>();
    for (int num : nums) {
      numsMap.merge(num, 1, Integer::sum);
    }

    int max = 0;
    int result = 0;
    for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        result = entry.getKey();
      }
    }

    return result;
  }

}
