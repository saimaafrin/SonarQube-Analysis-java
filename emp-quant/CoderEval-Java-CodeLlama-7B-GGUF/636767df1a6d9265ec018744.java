class Generated {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    List<TimeRange> timeRanges = new ArrayList<>();
        long duration = end - start;
        if(duration < FETCH_DATA_DURATION){
            timeRanges.add(TimeRange.fromStartEnd(start,end,TimeZone.getDefault()));
        }else{
            long startTime = start;
            long endTime = start + FETCH_DATA_DURATION;
            while(endTime < end){
                timeRanges.add(TimeRange.fromStartEnd(startTime,endTime,TimeZone.getDefault()));
                startTime = endTime;
                endTime = startTime + FETCH_DATA_DURATION;
            }
            timeRanges.add(TimeRange.fromStartEnd(startTime,end,TimeZone.getDefault()));
        }
        return timeRanges;
    }
    \end{code}
    
    Comment: I'm not sure I understand the question.  Are you asking how to get the start and end times of a day?
    
    Comment: @DaImTo I want to get the start and end time of a day.
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
    
    Comment: What is the format of the date?
    
    Comment: @DaImTo I use the format of yyyy-MM-dd
}
