public long lastWriteTimeStampInMilliseconds(){
if(lastWrite == -1){
        return -1;
    }else{
        return System.currentTimeMillis();
    }
}