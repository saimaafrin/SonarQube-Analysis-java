class Generated {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    List<TimeRange> timeRanges = new ArrayList<TimeRange>();
        long startTime = start;
        long endTime = end;
        long fetchDataDuration = FETCH_DATA_DURATION;
        long timeRange = fetchDataDuration;
        long timeRangeStart = startTime;
        long timeRangeEnd = timeRangeStart + timeRange;
        while(timeRangeEnd < endTime){
            timeRanges.add(new TimeRange(timeRangeStart,timeRangeEnd));
            timeRangeStart = timeRangeEnd;
            timeRangeEnd = timeRangeStart + timeRange;
        }
        timeRanges.add(new TimeRange(timeRangeStart,endTime));
        return timeRanges;
    }
}
