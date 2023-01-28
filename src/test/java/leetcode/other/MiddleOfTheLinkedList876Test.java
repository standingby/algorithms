package leetcode.other;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiddleOfTheLinkedList876Test {

  @Test
  public void correct() {
    ListNode listNode5 = new ListNode(5);
    ListNode listNode4 = new ListNode(4, listNode5);
    ListNode listNode3 = new ListNode(3, listNode4);
    ListNode listNode2 = new ListNode(2, listNode3);
    ListNode listNode1 = new ListNode(1, listNode2);

    ListNode actual = MiddleOfTheLinkedList876.middleNode(listNode1);

    Assertions.assertEquals(listNode3, actual);
  }

  @Test
  public void correct2() {
    ListNode listNode6 = new ListNode(6);
    ListNode listNode5 = new ListNode(5, listNode6);
    ListNode listNode4 = new ListNode(4, listNode5);
    ListNode listNode3 = new ListNode(3, listNode4);
    ListNode listNode2 = new ListNode(2, listNode3);
    ListNode listNode1 = new ListNode(1, listNode2);

    ListNode actual = MiddleOfTheLinkedList876.middleNode(listNode1);

    Assertions.assertEquals(listNode4, actual);
  }

}
