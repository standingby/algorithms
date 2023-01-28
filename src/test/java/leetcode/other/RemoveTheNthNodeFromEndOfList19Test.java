package leetcode.other;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveTheNthNodeFromEndOfList19Test {

  @Test
  public void correct() {
    int n = 2;
    ListNode listNode5 = new ListNode(5);
    ListNode listNode4 = new ListNode(4, listNode5);
    ListNode listNode3 = new ListNode(3, listNode4);
    ListNode listNode2 = new ListNode(2, listNode3);
    ListNode listNode1 = new ListNode(1, listNode2);

    ListNode actual = RemoveTheNthNodeFromEndOfList19.removeNthFromEnd(listNode1, n);

    Assertions.assertEquals(listNode1, actual);
  }

  @Test
  public void correct2() {
    int n = 1;
    ListNode listNode1 = new ListNode(1);

    ListNode actual = RemoveTheNthNodeFromEndOfList19.removeNthFromEnd(listNode1, n);

    Assertions.assertEquals(listNode1, actual);
  }

}
