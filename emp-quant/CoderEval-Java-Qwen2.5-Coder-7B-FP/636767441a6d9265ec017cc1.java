class Generated {
    private TreeNode<T> rotateRight(TreeNode<T> node){
    //assign left child to temp variable
        TreeNode<T> temp = node.left; 
        //assign right child of temp to right child of node
        node.left = temp.right; 
        //assign temp to right child of node
        temp.right = node; 
        //return new root
        return temp; 
    }
}
