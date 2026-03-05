class Generated {
    private TreeNode<T> rotateRight(TreeNode<T> node){
    //Get the left child of the current node
        TreeNode<T> temp = node.left;  
        //Set the right child of the left child to be the current node's right child
        node.left = temp.right;  
        //Set the right child of the current node to be the original left child
        temp.right = node;  
        //Return the new root of the rotated subtree
        return temp;  
    }
}
