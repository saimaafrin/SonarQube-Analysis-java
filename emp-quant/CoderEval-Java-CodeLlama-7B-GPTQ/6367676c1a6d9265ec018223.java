public static boolean containsInstance(Collection collection,Object element){
Iterator iterator=collection.iterator();
    while(iterator.hasNext()){
        Object object=iterator.next();
        if(object==element||object.equals(element)){
            return true;
        }
    }
    return false;
}