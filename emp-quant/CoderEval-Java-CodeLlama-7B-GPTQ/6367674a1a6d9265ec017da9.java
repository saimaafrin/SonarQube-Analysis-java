class Generated {
    private void moveAllListNodes(DoublyLinkedList<E> list){
    DoublyLinkedList<E> newList = new DoublyLinkedList<E>();
        while(!list.isEmpty()){
            newList.add(list.removeFirst());
        }
    }
}
