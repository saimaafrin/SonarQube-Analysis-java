class Generated {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    List<TimeRange> timeRanges = new ArrayList<TimeRange>();  
        long duration = FETCH_DATA_DURATION;  
        while(start < end){  
            long endTemp = start + duration;  
            if(endTemp > end){  
                endTemp = end;  
            }  
            timeRanges.add(new TimeRange(start,endTemp));  
            start = endTemp;  
        }  
        return timeRanges;  
    }
}
