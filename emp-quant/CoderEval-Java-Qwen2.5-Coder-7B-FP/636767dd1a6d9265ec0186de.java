public boolean isExpired(long timestamp,long expiredThreshold){
// write your code here
    long diff = timestamp - lastUpdateTimestamp;
    return diff > expiredThreshold;
}