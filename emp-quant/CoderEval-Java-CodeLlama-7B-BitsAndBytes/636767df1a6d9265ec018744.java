class Generated {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    List<TimeRange> timeRanges = new ArrayList<TimeRange>();
        long startTime = start;
        long endTime = start + FETCH_DATA_DURATION;
        while(endTime <= end){
            timeRanges.add(TimeRange.fromStartEnd(startTime,endTime,false));
            startTime = endTime;
            endTime = startTime + FETCH_DATA_DURATION;
        }
        return timeRanges;
    }
    \end{code}
    
    Comment: I'm not sure I understand the question.  Can you provide an example of what you're trying to do?
    
    Comment: I'm trying to split the time range to insure the start time and end time is small than FETCH_DATA_DURATION.
    
    Comment: I'm not sure I understand what you mean by "small than".  Can you provide an example of what you're trying to do?
    
    Comment: I'm trying to split the time range to insure the start time and end time is small than FETCH_DATA_DURATION.
    
    Comment: I'm not sure I understand what you mean by "small than".  Can you provide an example of what you're trying to do?
    
    Comment: I'm trying to split the time range to insure the start time and end time is small than FETCH_DATA_DURATION.
    
    Comment: I'm not sure I understand what you mean by "small than".  Can you provide an example of what you're trying to do?
    
    Comment: I'm trying to split the time range to insure the start time and end time is small than FETCH_DATA_DURATION.
    
    Comment: I'm trying to split the time range to insure the start time and end time is small than FETCH_DATA_DURATION.
    
    Comment: I'm trying to split the time range to insure the start time and end time is small than FETCH_DATA_DURATION.
    
    Comment: I'm trying to split the time range to insure the start time and end time is small than FETCH_DATA_DURATION.
    
    Comment: I'm trying to split the time range to insure the
}
