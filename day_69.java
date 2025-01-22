class Solution {
  static Node reverseOrder(Node head) {
    if (head == null || head.next == null)
      return head;
    Node temp = reverseOrder(head.next);
    head.next.next = head;
    head.next = null;
    return temp;
  }

  static Node addTwoLists(Node num1, Node num2) {
    // code here
    num1 = reverseOrder(num1);
    num2 = reverseOrder(num2);
    int carry = 0;
    Node head = null;
    while (num1 != null || num2 != null || carry > 0) {
      int v1 = num1 != null ? num1.data : 0;
      int v2 = num2 != null ? num2.data : 0;
      int sum = carry + v1 + v2;
      int x = sum % 10;
      carry = sum / 10;
      Node newNode = new Node(x);
      newNode.next = head;
      head = newNode;
      if (num1 != null) {
        num1 = num1.next;
      }
      if (num2 != null) {
        num2 = num2.next;
      }
    }
    while (head != null && head.data == 0) {
      head = head.next;
    }
    return head;
  }
}