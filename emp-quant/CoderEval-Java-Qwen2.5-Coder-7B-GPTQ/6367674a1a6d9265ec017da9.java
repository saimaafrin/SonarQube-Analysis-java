class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    DoublyNode<E> current = list.head; //start from head
        while(current != null){
            DoublyNode<E> next = current.next;
            current.next = null; //break the link
            if(list.head == current) { //if it is the first node, set as head
                list.head = current;
            } else {
                list.tail.next = current; //link to tail
            }
            current.prev = list.tail; //set previous pointer
            list.tail = current; //update tail
            current = next; //move to next node
        }
    }
}
