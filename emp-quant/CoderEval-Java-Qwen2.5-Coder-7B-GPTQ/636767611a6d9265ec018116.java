class Generated {
    private Set<V> intersection(Set<V> set1,Set<V> set2){
    Set<V> result = new HashSet<>(set1);  
        result.retainAll(set2);  
        return result;  
    }  
    
    **Explanation:**
    The `intersection` method takes two sets as input and returns a new set that contains only the elements that are present in both input sets. Here's how it works:
    
    1. A new `HashSet` named `result` is created by copying all elements from `set1`. This ensures that we start with all elements of `set1`.
    
    2. The `retainAll` method is called on `result` with `set2` as an argument. This method modifies `result` to keep only those elements that are also present in `set2`.
    
    3. Finally, the modified `result` set, which now contains only the common elements from both `set1` and `set2`, is returned.
    
    This approach efficiently finds the intersection using the properties of sets and their methods.
}
