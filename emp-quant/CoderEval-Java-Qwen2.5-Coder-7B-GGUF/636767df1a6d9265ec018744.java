class Generated {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    List<TimeRange> timeRanges = new ArrayList<TimeRange>();  
        long duration = end - start;  
        if(duration <= FETCH_DATA_DURATION){  
            timeRanges.add(new TimeRange(start,end));  
            return timeRanges;  
        }  
        long startTime = start;  
        while(true){  
            long endTime = startTime + FETCH_DATA_DURATION;  
            if(endTime > end){  
                endTime = end;  
            }  
            timeRanges.add(new TimeRange(startTime,endTime));  
            if(endTime == end){  
                break;  
            }  
            startTime = endTime;  
        }  
        return timeRanges;  
    }
}
