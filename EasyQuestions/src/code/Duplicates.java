package code;

public class Duplicates {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;
    while (curr != null) {
      ListNode temp = curr;
      while (temp != null && temp.val == curr.val) {
        temp = temp.next;
      }
      curr.next = temp;
      curr = curr.next;
    }
    return head;
  }

  public static void main(String[] args) {

    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    Duplicates test = new Duplicates();
    test.deleteDuplicates(head);
    System.out.println(test.deleteDuplicates(head));

  }

}
