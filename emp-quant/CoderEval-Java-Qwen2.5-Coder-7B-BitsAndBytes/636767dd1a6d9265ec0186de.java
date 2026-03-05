public boolean isExpired(long timestamp,long expiredThreshold){
long diff = timestamp - lastUpdateTimestamp;  
    return diff > expiredThreshold;  
}