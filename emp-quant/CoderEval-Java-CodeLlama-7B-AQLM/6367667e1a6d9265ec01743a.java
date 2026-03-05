public long lastWriteTimeStampInMilliseconds(){
if(lastWriteTimeStamp == -1){
		return -1;
	}
	return System.currentTimeMillis();
}