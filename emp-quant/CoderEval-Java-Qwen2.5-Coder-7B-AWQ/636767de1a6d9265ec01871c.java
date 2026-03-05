public void valueAccumulation(String key,Long value){
if(!map.containsKey(key)){  
        map.put(key,value);  
    }else{  
        Long oldValue = map.get(key);  
        oldValue += value;  
        map.put(key,oldValue);  
    }  
}  

**Explanation:**
The function `valueAccumulation` takes two parameters: a string `key` and a long integer `value`. It checks if the map already contains the given key. If not, it adds the key with the provided value. If the key already exists, it retrieves the current value associated with that key, adds the new value to it, and then updates the map with the new accumulated value. This ensures that the value for each key is always the sum of all values added under that key.