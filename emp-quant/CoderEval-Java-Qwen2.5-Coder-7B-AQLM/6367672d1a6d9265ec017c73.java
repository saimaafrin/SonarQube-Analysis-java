class Generated {
    public boolean shouldPrintMessage(int timestamp,String message){
    if(!messages.containsKey(message) || timestamp - messages.get(message) >= 10){  
            messages.put(message,timestamp);  
            return true;  
        }  
        return false;  
    }  
    
    **The above code is correct, but it is not efficient. The reason is that the HashMap is not thread-safe. If multiple threads are accessing the HashMap at the same time, it may cause a race condition and lead to incorrect results. To fix this, we can use a thread-safe version of HashMap, such as ConcurrentHashMap. Here is the modified code:**
    
    ```java
}
