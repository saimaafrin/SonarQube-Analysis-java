public boolean shouldPrintMessage(int timestamp,String message){
if(!messages.containsKey(message)){  
        messages.put(message,timestamp);  
        return true;  
    }else{  
        int lastTime = messages.get(message);  
        if(timestamp - lastTime > 10){  
            messages.put(message,timestamp);  
            return true;  
        }else{  
            return false;  
        }  
    }  
}  

**Explanation:**
- The method `shouldPrintMessage` checks whether a given message should be printed based on its timestamp.
- It uses a dictionary (`messages`) to store the last printed timestamp for each message.
- If the message is not in the dictionary, it adds the message with its current timestamp and returns `true`.
- If the message is already in the dictionary, it retrieves the last printed timestamp and compares it with the current timestamp.
- If the difference between the timestamps is greater than 10 seconds, it updates the timestamp in the dictionary and returns `true`.
- Otherwise, it returns `false`, indicating that the message should not be printed again within the next 10 seconds.

This approach ensures that each message can only be printed once every 10 seconds, as required.