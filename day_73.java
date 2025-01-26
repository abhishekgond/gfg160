class Solution {
  // Function to remove a loop in the linked list.
  public static void removeLoop(Node head) {
    // code here
    HashSet<Node> set = new HashSet<>();
    while (head != null && head.next != null) {
      if (!set.contains(head.next)) {
        set.add(head);
      } else {
        head.next = null;
      }
      head = head.next;
    }
  }
}