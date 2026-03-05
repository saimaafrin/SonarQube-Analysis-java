class Generated {
    private TreeNode<T> rotateRight(TreeNode<T> node){
    TreeNode<T> temp = node.left;  
        node.left = temp.right;  
        temp.right = node;  
        return temp;  
    }
}
