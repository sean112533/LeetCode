package code;

public class Merge {


  public ListNode mergeTwoList(ListNode l1, ListNode l2) {
    // when the node is empty in it's value we need to return null value.
    if (l1 == null && l2 == null) {
      return null;
    }
    ListNode head = new ListNode();// initalise the head of the node

    ListNode next = head;// initalise next is head of the node.
    /**
     * when the l1 ListNode and l2 ListNode is not empty value. check for the which node is bigger
     * or smaller value and decide the which node comes first.
     */
    while (l1 != null && l2 != null) {
      // if l2 is bigger or equal to l1
      if (l1.val <= l2.val) {
        next.next = l1;
        l1 = l1.next;
      } else {
        next.next = l2;
        l2 = l2.next;
      }
      next = next.next;
    }
    if (l1 != null)
      next.next = l1;
    if (l2 != null)
      next.next = l2;

    return head.next;

  }

  public static void main(String[] args) {

  }
}
