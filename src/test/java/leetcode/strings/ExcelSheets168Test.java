package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcelSheets168Test {

  @Test
  public void correct701() {
    int num = 701;
    String result = ExcelSheets168.convertToTitle(num);
    Assertions.assertEquals("ZY", result);
  }

  @Test
  public void correct720() {
    int num = 720;
    String result = ExcelSheets168.convertToTitle(num);
    Assertions.assertEquals("AAR", result);
  }


  @Test
  public void correct1() {
    int num = 1;
    String result = ExcelSheets168.convertToTitle(num);
    Assertions.assertEquals("A", result);
  }

  @Test
  public void correct28() {
    int num = 28;
    String result = ExcelSheets168.convertToTitle(num);
    Assertions.assertEquals("AB", result);
  }

  @Test
  public void correct52() {
    int num = 52;
    String result = ExcelSheets168.convertToTitle(num);
    Assertions.assertEquals("AZ", result);
  }
}
