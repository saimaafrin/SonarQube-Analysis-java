public void valueAccumulation(String key,Long value){
if(!map.containsKey(key)){  
        map.put(key,value);  
    }else{  
        map.put(key,map.get(key)+value);  
    }  
}  

**Explanation**:
The function `valueAccumulation` takes two parameters: a `String` key and a `Long` value. It checks if the key already exists in the map. If it does not exist, it adds the key with the given value. If the key already exists, it retrieves the current value associated with the key, adds the given value to it, and then updates the map with the new value. This ensures that the value associated with the key is the sum of all values that have been added for that key.