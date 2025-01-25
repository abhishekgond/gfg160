class Solution {
  public static Node findFirstNode(Node head) {
    // code here
    HashSet<Node> set = new HashSet<>();
    Node temp = head;
    while (temp != null) {
      if (!set.contains(temp)) {
        set.add(temp);
      } else {
        return temp;
      }
      temp = temp.next;
    }
    return null;
  }
}