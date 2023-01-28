package leetcode.other;

import leetcode.common.ListNode;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/"</a>
 */
@UtilityClass
public class MiddleOfTheLinkedList876 {

  public ListNode middleNode(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

}
