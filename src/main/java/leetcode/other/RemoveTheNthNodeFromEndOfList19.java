package leetcode.other;

import leetcode.common.ListNode;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/"</a>
 */
@UtilityClass
public class RemoveTheNthNodeFromEndOfList19 {

  public ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode slow = head;
    ListNode fast = head;

    for (int i = 0; fast != null; i++) {
      if (fast.next == null) {
        if (slow.next == null) {
          head = null;
        } else if (slow.next.next != null) {
          slow.next = slow.next.next;
        } else {
          slow.next = null;
        }
        break;
      }

      if (i > n) {
        slow = slow.next;
      }else if (i == n) {
        slow = null;
      }

      fast = fast.next;
    }

    return head;
  }
}
