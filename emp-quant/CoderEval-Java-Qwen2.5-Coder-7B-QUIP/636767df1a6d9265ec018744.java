protected List<TimeRange> buildTimeRanges(long start,long end){
List<TimeRange> timeRanges = new ArrayList<>();
    long duration = FETCH_DATA_DURATION;
    long startTime = start;
    while (startTime < end) {
        long endTime = startTime + duration;
        if (endTime > end) {
            endTime = end;
        }
        timeRanges.add(new TimeRange(startTime, endTime));
        startTime = endTime;
    }
    return timeRanges;
}