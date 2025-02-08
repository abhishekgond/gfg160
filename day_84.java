class Solution {
  static void leftBoundary(Node root, ArrayList<Integer> al) {
    Node cur = root.left;
    while (cur != null) {
      if (!isLeaf(cur))
        al.add(cur.data);
      if (cur.left != null)
        cur = cur.left;
      else
        cur = cur.right;
    }
  }

  static void leafNode(Node root, ArrayList<Integer> al) {
    if (root == null)
      return;
    if (isLeaf(root)) {
      al.add(root.data);
      return;
    }
    if (root.left != null)
      leafNode(root.left, al);
    if (root.right != null)
      leafNode(root.right, al);
  }

  static void rightBoundary(Node root, ArrayList<Integer> al) {
    Node cur = root.right;
    ArrayList<Integer> tmp = new ArrayList<>();
    while (cur != null) {
      if (!isLeaf(cur))
        tmp.add(cur.data);
      if (cur.right != null)
        cur = cur.right;
      else
        cur = cur.left;
    }
    Collections.reverse(tmp);
    al.addAll(tmp);
  }

  static boolean isLeaf(Node root) {
    return root.left == null && root.right == null;
  }

  ArrayList<Integer> boundaryTraversal(Node node) {
    // code here
    ArrayList<Integer> al = new ArrayList<>();
    if (isLeaf(node) == false)
      al.add(node.data);
    leftBoundary(node, al);
    leafNode(node, al);
    rightBoundary(node, al);
    return al;
  }
}