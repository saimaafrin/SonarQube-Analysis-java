public boolean isExpired(long timestamp,long expiredThreshold){
return (timestamp - lastUpdateTimestamp) > expiredThreshold;
}