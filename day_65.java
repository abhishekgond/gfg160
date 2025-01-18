class Solution {
  Node reverseList(Node head) {
    // code here
    Node p = null;
    while (head != null) {
      Node n = head.next;
      if (p == null) {
        p = head;
        p.next = null;
      } else {
        head.next = p;
        p = head;
      }
      head = n;
    }
    return p;
  }
}