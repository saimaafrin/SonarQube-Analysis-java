public boolean shouldPrintMessage(int timestamp,String message){
if(!messages.containsKey(message) || messages.get(message) < timestamp - 10){
        messages.put(message, timestamp);
        return true;
    }
    return false;
}