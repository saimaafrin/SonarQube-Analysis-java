public static boolean containsInstance(Collection collection,Object element){
if(collection==null||element==null){
        return false;
    }
    for(Object obj:collection){
        if(obj.equals(element)){
            return true;
        }
    }
    return false;
}