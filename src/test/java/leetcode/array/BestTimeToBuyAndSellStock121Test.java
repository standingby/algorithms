package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStock121Test {

  @Test
  public void correct() {
    int[] prices = new int[]{7, 1, 5, 3, 6, 4};
    int expected = 5;
    int actual = BestTimeToBuyAndSellStock121.maxProfit(prices);
    Assertions.assertEquals(expected, actual);
  }

}
