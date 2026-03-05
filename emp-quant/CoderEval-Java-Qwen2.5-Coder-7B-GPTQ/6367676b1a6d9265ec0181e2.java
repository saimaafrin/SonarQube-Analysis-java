public static Object findFirstMatch(Collection source,Collection candidates){
Iterator iter = source.iterator(); 
    while(iter.hasNext()){ 
        Object item = iter.next(); 
        if(candidates.contains(item)){ 
            return item; 
        } 
    } 
    return null; 
} 

**Explanation:**
The function `findFirstMatch` takes two parameters: a `source` collection and a `candidates` collection. It iterates over each element in the `source` collection using an iterator. For each element, it checks if the element is contained within the `candidates` collection using the `contains` method. If a match is found, the function returns that element immediately. If no matches are found after iterating through all elements of the `source`, the function returns `null`. This function is useful for finding common elements between two collections efficiently.