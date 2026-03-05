class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    if(list == null || list.isEmpty())
            return;
        DoublyLinkedList<E> newList = new DoublyLinkedList<E>();
        DoublyLinkedList<E> current = list;
        while(current != null){
            newList.add(current.getData());
            current = current.getNext();
        }
        list = newList;
    }
}
