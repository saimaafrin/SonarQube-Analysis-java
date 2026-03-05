public boolean shouldPrintMessage(int timestamp,String message){
if(!messages.containsKey(message) || Math.abs(timestamp - messages.get(message)) > 10){
        messages.put(message, timestamp);
        return true;
    }
    return false;
}