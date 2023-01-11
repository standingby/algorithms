package leetcode.strings;

import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-title/description/"</a>
 */
@UtilityClass
public class ExcelSheets168 {

  public String convertToTitle(int columnNumber) {
    StringBuilder ans = new StringBuilder();
    while (columnNumber > 0) {
      columnNumber--;
      ans.insert(0, (char) ('A' + (columnNumber % 26)));
      columnNumber = columnNumber / 26;
    }
    return ans.toString();

  }
}
