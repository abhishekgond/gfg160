class Solution {
  int ans = 0;

  int diameter(Node root) {
    // Your code here
    noOfEdges(root);
    return ans;
  }

  int noOfEdges(Node root) {
    if (root == null)
      return 0;

    int left = noOfEdges(root.left);
    int right = noOfEdges(root.right);
    ans = Math.max(ans, (left + right));

    return Math.max(left, right) + 1;
  }
}