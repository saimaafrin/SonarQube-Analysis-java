class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    Node<E> current = list.head; // Start from the head of the original list
        while (current != null) { 
            Node<E> nextNode = current.next; // Store the next node in case we need to continue iterating
            current.next = null; // Break the link between the current node and the rest of the list
            if (list.head == current) { 
                list.head = null; // If it's the first node, set the head to null
            } else { 
                current.prev.next = null; // Otherwise, break the link with the previous node
            }
            current.prev = null; // Set the previous pointer to null
            if (newList.head == null) { 
                newList.head = current; // If the new list is empty, set the head to the current node
            } else { 
                Node<E> tail = newList.getTail(); // Get the tail of the new list
                tail.next = current; // Link the current node to the tail of the new list
                current.prev = tail; // Update the previous pointer of the current node
            }
            current = nextNode; // Move to the next node in the original list
        }
    }
}
