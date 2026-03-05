class Generated {
    public boolean shouldPrintMessage(int timestamp,String message){
    if(!messages.containsKey(message)||timestamp-messages.get(message)>=10){
            messages.put(message,timestamp);
            return true;
        }else{
            return false;
        }
    }
}
