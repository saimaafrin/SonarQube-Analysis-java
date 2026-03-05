static long compressTimeBucket(long timeBucket,int dayStep){
if(dayStep == 0){
        return timeBucket;
    }
    long timeBucketDay = timeBucket / 1000000 / 60 / 60 / 24;
    long timeBucketDayCompressed = timeBucketDay * dayStep;
    long timeBucketCompressed = timeBucketDayCompressed * 1000000 * 60 * 60 * 24 + timeBucket % (1000000 * 60 * 60 * 24);
    return timeBucketCompressed;
}