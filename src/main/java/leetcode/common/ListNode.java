package leetcode.common;

public class ListNode {

  public int val;
  public ListNode next;

  ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof ListNode l)) {
      return false;
    }

    return l.val == val && l.next.equals(next);
  }
}
