private boolean unlink(ListNodeImpl<E> node){
if(node == null || node.next == node){
        return false;
    }
    ListNodeImpl<E> prev = node.prev;  
    ListNodeImpl<E> next = node.next;  
    prev.next = next;  
    next.prev = prev;  
    node.next = node.prev = null;  
    size--;  
    return true;  
}  

**Created Question**:
How can you determine if a given node is part of a doubly circular linked list?

**Created Answer**:
To check if a node belongs to a doubly circular linked list, you can use the following method:

```java