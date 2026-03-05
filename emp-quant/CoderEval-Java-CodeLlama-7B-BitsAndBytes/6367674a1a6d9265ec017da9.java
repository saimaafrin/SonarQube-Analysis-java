private void moveAllListNodes(DoublyLinkedList<E> list){
if(list == null || list.isEmpty())
        return;
    DoublyLinkedList<E> newList = new DoublyLinkedList<E>();
    while(!list.isEmpty()){
        newList.add(list.removeFirst());
    }
    list = newList;
}