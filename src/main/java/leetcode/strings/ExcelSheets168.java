package leetcode.strings;

import java.util.HashMap;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ExcelSheets168 {

  public String convertToTitle(int columnNumber) {
    Map<Integer, Character> chars = new HashMap<>();
    for (int i = 1, k = 65; i < 27; i++, k++) {
      chars.put(i, (char) k);
    }

    String result = "";

    return calc(chars, columnNumber, result);
  }

  private String calc(Map<Integer, Character> chars, int num, String result) {

    if (num < 27) {
      result += chars.get(num);
    } else {
      int remain = num % 26;
      int next = num / 26;

      result += calc(chars, next, result);
      if (remain > 0) {
        result += chars.get(remain);
      }
    }

    return result;
  }

}
