class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    DoublyLinkedList<E> newList = new DoublyLinkedList<E>(); 
        Node<E> current = list.head; 
        while(current != null){ 
            newList.add(current.data); 
            current = current.next; 
        } 
        list.head = newList.head; 
        list.tail = newList.tail; 
    }
}
