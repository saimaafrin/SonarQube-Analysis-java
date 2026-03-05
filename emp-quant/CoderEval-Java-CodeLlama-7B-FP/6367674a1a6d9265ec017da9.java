private void moveAllListNodes(DoublyLinkedList<E> list){
if(list == null || list.isEmpty()){
        return;
    }
    DoublyLinkedList<E> newList = new DoublyLinkedList<>();
    while(!list.isEmpty()){
        newList.add(list.removeFirst());
    }
    this.head = newList.head;
    this.tail = newList.tail;
    this.size = newList.size;
}