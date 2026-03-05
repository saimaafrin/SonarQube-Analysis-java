class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    Node<E> current = list.head; //start from head
        while(current != null){
            Node<E> next = current.next; //store next node
            current.next = null; //break link
            if(list.head == current) { //if it's the first node, set as head
                list.head = current;
            } else {
                tail.next = current; //add to end
            }
            tail = current; //update tail
            current = next; //move to next node
        }
    }
}
