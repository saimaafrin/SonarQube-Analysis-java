public boolean shouldPrintMessage(int timestamp,String message){
if(messages.containsKey(message)){
        if(timestamp-messages.get(message)<=10) return false;
    }
    messages.put(message,timestamp);
    return true;
}