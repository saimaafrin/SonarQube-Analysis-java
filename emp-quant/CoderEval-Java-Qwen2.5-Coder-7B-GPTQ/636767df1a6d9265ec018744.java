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

**This function will split a large time range into smaller ones, each of which has a duration less than or equal to `FETCH_DATA_DURATION`. The resulting list of `TimeRange` objects can then be used to fetch data in smaller chunks, which may be more efficient or easier to handle than fetching all data at once.**

**The function takes two arguments: `start` and `end`, which represent the start and end times of the large time range that needs to be split. It returns a list of `TimeRange` objects, where each object represents a smaller time range with a duration less than or equal to `FETCH_DATA_DURATION`.**

**If the duration of the large time range is less than or equal to `FETCH_DATA_DURATION`, the function simply returns a single `TimeRange` object representing the entire time range. Otherwise, it splits the time range into smaller ones using a loop, and adds each smaller time range to the result list.**

**In each iteration of the loop, the function calculates the start and end times of the next smaller time range by adding `FETCH_DATA_DURATION` to the current start time, but not exceeding the end time of the large time range. It then creates a new `TimeRange` object with these start and end times, and adds it to the result list. Finally, it updates the current start time to the end time of the next smaller time range, and continues the loop until all time ranges have been processed.**