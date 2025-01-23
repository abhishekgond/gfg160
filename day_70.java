class Solution {
  public Node cloneLinkedList(Node head) {
    if (head == null) {
      return null;
    }
    Node curr = head;
    while (curr != null) {
      Node copy = new Node(curr.data);
      copy.next = curr.next;
      curr.next = copy;
      curr = copy.next;
    }
    curr = head;
    while (curr != null) {
      if (curr.random != null) {
        curr.next.random = curr.random.next;
      }
      curr = curr.next.next;
    }
    curr = head;
    Node copyHead = head.next;
    while (curr != null) {
      Node copy = curr.next;
      curr.next = copy.next;
      if (copy.next != null) {
        copy.next = copy.next.next;
      }
      curr = curr.next;
    }
    return copyHead;
  }
}