package leetcode.other;

import java.util.HashMap;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MostFrequentEvenElement2404 {

  public int mostFrequentEven(int[] nums) {
    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int num : nums) {
      if (num % 2 == 0) {
        numsMap.merge(num, 1, Integer::sum);
      }
    }

    if (numsMap.isEmpty()) {
      return -1;
    }

    int maxValue = 0;

    for (int value : numsMap.values()) {
      if (value > maxValue) {
        maxValue = value;
      }
    }

    int minKey = Integer.MAX_VALUE;

    for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {

      if (entry.getValue() != maxValue) {
        continue;
      }

      if (entry.getKey() < minKey) {
        minKey = entry.getKey();
      }
    }

    return minKey;
  }

}
