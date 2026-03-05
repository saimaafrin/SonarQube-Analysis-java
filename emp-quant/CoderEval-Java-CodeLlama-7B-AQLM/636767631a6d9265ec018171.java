class Generated {
    private boolean unlink(ListNodeImpl<E> node){
    if(node == null){
            return false;
        }
        ListNodeImpl<E> prev = node.prev;
        ListNodeImpl<E> next = node.next;
        if(prev == null || next == null){
            return false;
        }
        prev.next = next;
        next.prev = prev;
        node.prev = null;
        node.next = null;
        return true;
    }
}
