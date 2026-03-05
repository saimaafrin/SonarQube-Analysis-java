private void moveAllListNodes(DoublyLinkedList<E> list){
// Your code here
    DoublyLinkedList<E> newList = new DoublyLinkedList<>();
    Node<E> current = list.head;
    while (current != null) {
        newList.add(current.data);
        current = current.next;
    }
    list.head = newList.head;
    list.tail = newList.tail;
    list.size = newList.size;
}