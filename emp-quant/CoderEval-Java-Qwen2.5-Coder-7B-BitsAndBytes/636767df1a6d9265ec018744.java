protected List<TimeRange> buildTimeRanges(long start,long end){
long duration = end - start;  
    if(duration <= FETCH_DATA_DURATION){  
        return Collections.singletonList(new TimeRange(start,end));  
    }else{  
        List<TimeRange> result = new ArrayList<>();  
        while(start < end){  
            long nextStart = Math.min(start + FETCH_DATA_DURATION, end);  
            result.add(new TimeRange(start,nextStart));  
            start = nextStart;  
        }  
        return result;  
    }  
}  

**TimeRange class:**
```java