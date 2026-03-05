class Generated {
    public void valueAccumulation(String key,Long value){
    if(!map.containsKey(key)){  
            map.put(key,value);  
        }else{  
            Long oldValue = map.get(key);  
            map.put(key,oldValue+value);  
        }  
    }  
    
    **Explanation:**
    The function `valueAccumulation` takes two parameters: a string `key` and a long integer `value`. It checks if the `key` already exists in the `map`. If it does not exist, it adds the `key` with the given `value`. If the `key` already exists, it retrieves the current value associated with that `key`, adds the new `value` to it, and then updates the `map` with this new accumulated value.
    
    This function is useful when you need to keep track of cumulative values for each unique key over time or across different operations.
}
