class Generated {
    private TreeNode<T> rotateRight(TreeNode<T> node){
    TreeNode<T> left = node.left;
        node.left = left.right;
        left.right = node;
        node.height = Math.max(node.height, left.height + 1);
        return left;
    }
}
