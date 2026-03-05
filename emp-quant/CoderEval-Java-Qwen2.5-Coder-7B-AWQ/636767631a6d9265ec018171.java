private boolean unlink(ListNodeImpl<E> node){
if(node == null || node.next == null) return false; //node is not a valid node or it's the last node in the list
    ListNodeImpl<E> prev = node.prev;
    ListNodeImpl<E> next = node.next;
    prev.next = next;
    next.prev = prev;
    node.prev = null;
    node.next = null;
    size--;
    return true;
}