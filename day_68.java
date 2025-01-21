class Solution {
  static int getLength(Node root) {
    int count = 0;
    ;
    while (root != null) {
      count++;
      root = root.next;
    }
    return count;
  }

  public static Node reverseKGroup(Node head, int k) {
    // code here
    int len = getLength(head);
    Node origH = null, origT = null, tempH = null, tempT = null;
    Node curr = head;
    while (len > 0) {
      int j = k;
      j = Math.min(j, len);
      while (j > 0) {
        Node nex = curr.next;
        if (tempH == null) {
          tempH = curr;
          tempT = curr;
        } else {
          curr.next = tempH;
          tempH = curr;
        }
        curr = nex;
        j--;
        len--;
      }
      if (origH == null) {
        origH = tempH;
        origT = tempT;
      } else {
        origT.next = tempH;
        origT = tempT;
      }
      tempH = null;
      tempT = null;
    }
    origT.next = null;
    return origH;
  }
}