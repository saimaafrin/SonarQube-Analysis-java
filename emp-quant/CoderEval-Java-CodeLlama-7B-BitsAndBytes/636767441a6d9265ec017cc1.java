class Generated {
    private TreeNode<T> rotateRight(TreeNode<T> node){
    TreeNode<T> left = node.left;
        node.left = left.right;
        left.right = node;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        left.height = Math.max(height(left.left), height(left.right)) + 1;
        return left;
    }
}
