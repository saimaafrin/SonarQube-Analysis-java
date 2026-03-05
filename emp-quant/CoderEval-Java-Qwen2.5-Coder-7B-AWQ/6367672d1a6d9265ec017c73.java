class Generated {
    public boolean shouldPrintMessage(int timestamp,String message){
    if(!messages.containsKey(message)){
            messages.put(message,timestamp);
            return true;
        }else{
            int lastTime = messages.get(message);
            if(timestamp - lastTime > 10){
                messages.put(message,timestamp);
                return true;
            }
        }
        return false;
    }
}
