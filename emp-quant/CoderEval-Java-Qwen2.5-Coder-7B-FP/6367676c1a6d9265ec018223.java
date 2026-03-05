public static boolean containsInstance(Collection collection,Object element){
if(collection==null||element==null) return false;  
    for(Object obj:collection){  
        if(obj.equals(element)) return true;  
    }  
    return false;  
}  

**Explanation:** The function `containsInstance` checks if a given object (`element`) is present in a specified collection. It iterates through each element of the collection using an enhanced for loop and compares it with the target element using the `equals()` method to ensure proper comparison, especially for objects that might not be directly comparable by reference. If any element matches the target, the function returns `true`. If no match is found after checking all elements, it returns `false`.

This function is useful when you need to verify the presence of an item within a collection without needing to know its exact position or index.