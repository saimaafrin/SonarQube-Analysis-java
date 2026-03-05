public static boolean containsInstance(Collection collection,Object element){
if(collection==null||element==null) return false;  
    for(Object obj:collection){  
        if(obj.equals(element)) return true;  
    }  
    return false;  
}  

**Explanation:** 
- The function `containsInstance` checks if a given `element` is present in the provided `collection`.
- It first verifies that neither the `collection` nor the `element` is null, returning `false` immediately if either is.
- It then iterates over each object in the `collection`. For each object (`obj`), it uses the `equals` method to compare it with the `element`.
- If any object in the collection matches the `element`, the function returns `true`.
- If no match is found after checking all elements, the function returns `false`.

This method ensures that the presence of an element is checked efficiently and correctly.