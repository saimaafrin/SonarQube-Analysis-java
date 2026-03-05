class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    DoublyNode<E> current = list.head; // Start from the head of the original list
        while(current != null){
            DoublyNode<E> next = current.next; // Store the next node
            current.next = null; // Disconnect the current node from the original list
            if(list.head == current) {
                list.head = next; // Update the head of the original list
            }
            if(list.tail == current) {
                list.tail = previous; // Update the tail of the original list
            }
            if(newHead == null) {
                newHead = current; // Set the head of the new list
            } else {
                newTail.next = current; // Connect the current node to the new list
            }
            newTail = current; // Move the tail pointer to the current node
            current = next; // Move to the next node in the original list
        }
    }
}
