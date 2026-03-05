class Generated {
    private TreeNode<T> rotateRight(TreeNode<T> node){
    // Store the left child of the current node as newRoot
        TreeNode<T> newRoot = node.left; 
    
        // Update the left child of the current node to be the right child of newRoot
        node.left = newRoot.right; 
    
        // Set the right child of newRoot to be the current node
        newRoot.right = node; 
    
        // Return the new root after rotation
        return newRoot; 
    }
}
