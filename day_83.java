class Solution {
  // Function to return a list containing the inorder traversal of the tree.
  static void inorder(Node root, ArrayList<Integer> al) {
    if (root == null) {
      return;
    }
    inorder(root.left, al);
    al.add(root.data);
    inorder(root.right, al);
  }

  ArrayList<Integer> inOrder(Node root) {
    // Code
    ArrayList<Integer> al = new ArrayList<>();
    inorder(root, al);
    return al;
  }
}