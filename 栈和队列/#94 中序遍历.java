class Solution {
    List<Integer> result = new LinkedList<>();
     public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null) return new LinkedList<>();

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);

        return result;
    }
}