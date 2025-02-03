class Solution {
  // Function to find the height of a binary tree.
  int height(Node root) {
    // code here
    if (root == null)
      return -1;
    return Math.max(height(root.left), height(root.right)) + 1;
  }
}