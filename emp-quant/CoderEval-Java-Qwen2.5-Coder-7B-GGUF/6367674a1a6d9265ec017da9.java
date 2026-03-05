class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    if(list == null || list.isEmpty()) return; 
        Node<E> current = list.head; 
        while(current != null){ 
            Node<E> next = current.next; 
            current.next = null; 
            current.prev = null; 
            list.remove(current); 
            list.add(current); 
            current = next; 
        } 
    }
}
