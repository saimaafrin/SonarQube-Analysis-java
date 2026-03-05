class Generated {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    List<TimeRange> timeRanges = new ArrayList<TimeRange>();
        long startTime = start;
        long endTime = start + FETCH_DATA_DURATION;
        while(endTime <= end){
            TimeRange timeRange = new TimeRange(startTime,endTime);
            timeRanges.add(timeRange);
            startTime = endTime;
            endTime = startTime + FETCH_DATA_DURATION;
        }
        return timeRanges;
    }
}
