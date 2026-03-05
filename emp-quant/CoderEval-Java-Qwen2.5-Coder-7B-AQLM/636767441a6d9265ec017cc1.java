private TreeNode<T> rotateRight(TreeNode<T> node){
TreeNode<T> leftChild = node.left; 
    node.left = leftChild.right; 
    leftChild.right = node; 
    return leftChild; 
}