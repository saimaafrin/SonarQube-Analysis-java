public static boolean containsInstance(Collection collection,Object element){
if (collection==null) {  
        throw new IllegalArgumentException("The collection is null");  
    }  
    if (element==null) {  
        throw new IllegalArgumentException("The element is null");  
    }  
    return collection.contains(element);  
}  

**Check whether the element exists in the collection.**