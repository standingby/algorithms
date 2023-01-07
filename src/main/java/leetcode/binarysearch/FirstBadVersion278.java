package leetcode.binarysearch;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FirstBadVersion278 {

  private int someBad;

  public int firstBadVersion(int n, int bad) {
    someBad = bad;
    int left = 1;
    int right = n;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  //Dummy
  private boolean isBadVersion(int n) {
    return n == someBad;
  }
}
