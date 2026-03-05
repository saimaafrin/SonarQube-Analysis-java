public static boolean containsInstance(Collection collection,Object element){
if(collection==null||element==null){  
        return false;  
    }  
    return collection.contains(element);  
}