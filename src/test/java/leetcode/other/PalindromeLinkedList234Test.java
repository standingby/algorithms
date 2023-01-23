package leetcode.other;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedList234Test {

  @Test
  public void incorrect() {

    ListNode listNode2 = new ListNode(2);
    ListNode listNode1 = new ListNode(1, listNode2);

    boolean result = PalindromeLinkedList234.isPalindrome(listNode1);
    Assertions.assertFalse(result);
  }

  @Test
  public void correct() {

    ListNode listNode4 = new ListNode(1);
    ListNode listNode3 = new ListNode(2, listNode4);
    ListNode listNode2 = new ListNode(2, listNode3);
    ListNode listNode1 = new ListNode(1, listNode2);

    boolean result = PalindromeLinkedList234.isPalindrome(listNode1);
    Assertions.assertFalse(result);
  }
}
