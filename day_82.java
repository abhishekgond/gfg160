class Solution {
  // Function to convert a binary tree into its mirror tree.
  void mirror(Node node) {
      // Your code here
      solve(node);
  }
  Node solve(Node root){
      if(root==null){
          return root;
      }
      Node left = solve(root.left);
      Node right = solve(root.right);
      root.left = right;
      root.right =left;
      return root;
  }
}