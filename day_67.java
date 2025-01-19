class Solution {
  Node sortedMerge(Node head1, Node head2) {
    // code here
    Node p = new Node(0);
    Node temp = p;
    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
      }
      temp = temp.next;
    }
    if (head1 != null) {
      temp.next = head1;
    }
    if (head2 != null) {
      temp.next = head2;
    }
    return p.next;
  }
}