package leetcode.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.common.ListNode;
import lombok.experimental.UtilityClass;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/"</a>
 */
@UtilityClass
public class PalindromeLinkedList234 {

  public boolean isPalindrome(ListNode head) {

    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    List<Integer> list1 = list.subList(0, list.size()/2);
    List<Integer> list2 = list.subList(list.size()/2, list.size());

    for (int i = 0, k = list2.size(); i < list1.size() && k > list2.size()/2; i++, k--) {
      if (!list1.get(i).equals(list2.get(i))) {
        return false;
      }
    }

    return true;
  }
}


