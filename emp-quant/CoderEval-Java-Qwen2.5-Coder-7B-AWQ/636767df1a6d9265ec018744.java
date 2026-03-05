class Generated {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    long duration = end - start;  
        if(duration <= FETCH_DATA_DURATION){  
            return Collections.singletonList(new TimeRange(start,end));  
        }else{  
            List<TimeRange> result = new ArrayList<>();  
            while(start < end){  
                long nextEnd = Math.min(start + FETCH_DATA_DURATION, end);  
                result.add(new TimeRange(start,nextEnd));  
                start = nextEnd;  
            }  
            return result;  
        }  
    }  
    
    **This method will split a large time range into smaller ones, each with a maximum duration of FETCH_DATA_DURATION. The purpose is to ensure that when fetching data, the time range does not exceed the maximum allowed duration. This can help in managing resources more efficiently and avoiding potential issues related to large data fetches.**
    
    **The method takes two parameters:**
    - `start`: The starting timestamp of the original time range.
    - `end`: The ending timestamp of the original time range.
    
    **It returns a list of `TimeRange` objects, where each object represents a smaller time range with a duration less than or equal to `FETCH_DATA_DURATION`.**
    
    **Here's how the method works:**
    1. It first checks if the duration of the original time range (`duration`) is less than or equal to `FETCH_DATA_DURATION`.
       - If true, it returns a single `TimeRange` object containing the entire original time range.
    2. If the duration exceeds `FETCH_DATA_DURATION`, it enters a loop:
       - In each iteration, it calculates the next end timestamp as the minimum of the current start timestamp plus `FETCH_DATA_DURATION` and the actual end timestamp.
       - It adds a new `TimeRange` object from the current start timestamp to the calculated next end timestamp to the result list.
       - It then updates the start timestamp to the next end timestamp for the next iteration.
    3. The loop continues until all parts of the original time range are processed.
    4. Finally, it returns the list of `TimeRange` objects representing the smaller time ranges.
    
    **This approach ensures that the time ranges are broken down appropriately, making it easier to manage data fetching operations within the constraints imposed by `FETCH_DATA_DURATION`.**
}
