class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    if(list == null)
            return;
        DoublyLinkedList<E> newList = new DoublyLinkedList<E>();
        DoublyLinkedList<E> temp = list;
        while(temp != null){
            newList.add(temp.getData());
            temp = temp.getNext();
        }
        list = newList;
    }
}
