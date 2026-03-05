private Set<V> intersection(Set<V> set1,Set<V> set2){
Set<V> result = new HashSet<V>();  
    for(V v : set1){  
        if(set2.contains(v)){  
            result.add(v);  
        }  
    }  
    return result;  
}  

**Explanation**:
The function `intersection` takes two sets, `set1` and `set2`, as input and returns a new set that contains only the elements that are common to both `set1` and `set2`. The function initializes an empty set `result` to store the intersection. It then iterates over each element `v` in `set1`. For each element, it checks if `v` is also present in `set2` using the `contains` method. If `v` is found in both sets, it is added to the `result` set. Finally, the function returns the `result` set, which contains the intersection of `set1` and `set2`.