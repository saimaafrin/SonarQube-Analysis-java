class Generated {
    static long compressTimeBucket(long timeBucket,int dayStep){
    long timeBucketFormat = TIME_BUCKET_FORMATTER.format(timeBucket);  
        long timeBucketFormat2 = timeBucketFormat - dayStep;  
        return TIME_BUCKET_FORMATTER.format(timeBucketFormat2);  
    }  
    
    **The following is the TIME_BUCKET_FORMATTER:**
    
    static final SimpleDateFormat TIME_BUCKET_FORMATTER = new SimpleDateFormat("yyyyMMdd");  
    
    **The following is the dayStep:**
    
    static final int dayStep = 11;  
    
    **The following is the timeBucket:**
    
    static final long timeBucket = 20000105;  
    
    **The following is the compressed timeBucket:**
    
    static final long compressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the expected compressed timeBucket:**
    
    static final long expectedCompressedTimeBucket = 20000101;  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed timeBucket:**
    
    static final long actualCompressedTimeBucket = compressTimeBucket(timeBucket, dayStep);  
    
    **The following is the actual compressed
}
