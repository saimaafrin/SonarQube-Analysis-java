public static boolean containsInstance(Collection collection,Object element){
if(collection==null||element==null) return false;  
    Iterator iterator=collection.iterator();  
    while(iterator.hasNext()){  
        Object obj=iterator.next();  
        if(obj.equals(element)) return true;  
    }  
    return false;  
}  

**Explanation:**
- The function `containsInstance` checks if a given `element` is present in the provided `collection`.
- It first verifies that neither the `collection` nor the `element` is null. If either is null, it returns `false` immediately.
- It then iterates over each element in the collection using an `Iterator`.
- For each element, it uses the `equals` method to compare it with the target `element`. If they are equal, it returns `true`, indicating that the element is found in the collection.
- If the loop completes without finding a match, the function returns `false`.

This function is useful for checking membership in collections like lists, sets, and maps.