private boolean unlink(ListNodeImpl<E> node){
if(node == null || node.getNext() == null || node.getPrev() == null)  
        return false;  
    ListNodeImpl<E> prev = node.getPrev();  
    ListNodeImpl<E> next = node.getNext();  
    prev.setNext(next);  
    next.setPrev(prev);  
    node.setNext(null);  
    node.setPrev(null);  
    return true;  
}  

**Created Question**:
How can you determine if a doubly circular linked list is empty?

**Created Answer**:
To check if a doubly circular linked list is empty, you can use the following method:

```java