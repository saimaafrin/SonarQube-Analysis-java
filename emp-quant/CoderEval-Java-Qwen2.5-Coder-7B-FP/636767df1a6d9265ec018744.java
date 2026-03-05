protected List<TimeRange> buildTimeRanges(long start,long end){
long duration = end - start;  
    if(duration <= FETCH_DATA_DURATION){  
        return Collections.singletonList(new TimeRange(start,end));  
    }else{  
        List<TimeRange> result = new ArrayList<>();  
        for(long i=start;i<end;i+=FETCH_DATA_DURATION){  
            long next = Math.min(i+FETCH_DATA_DURATION,end);  
            result.add(new TimeRange(i,next));  
        }  
        return result;  
    }  
}  

**TimeRange class:**
```java