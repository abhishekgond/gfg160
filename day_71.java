class Solution {
  // Function to check if the linked list has a loop.
  public static boolean detectLoop(Node head) {
    // Add code here
    Node temp = head;
    Node temp1 = head;
    while (temp != null && temp1 != null && temp1.next != null) {
      temp = temp.next;
      temp1 = temp1.next.next;
      if (temp1 == temp) {
        return true;
      }
    }
    return false;

  }
}