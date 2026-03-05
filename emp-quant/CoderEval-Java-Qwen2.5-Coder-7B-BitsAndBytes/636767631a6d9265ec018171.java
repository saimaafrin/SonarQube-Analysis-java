private boolean unlink(ListNodeImpl<E> node){
if(node == null) return false;  
    ListNodeImpl<E> prev = node.prev;  
    ListNodeImpl<E> next = node.next;  
    prev.next = next;  
    next.prev = prev;  
    size--;  
    return true;  
}  

**Created Question**:
Implement a method to insert an element at a specific position in a doubly circular linked list.

**Created Answer**:
```java