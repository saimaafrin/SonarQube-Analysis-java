class Generated {
    static long compressTimeBucket(long timeBucket,int dayStep){
    long timeBucketCompressed = timeBucket;
        if(dayStep == 1){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000);
        }else if(dayStep == 11){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 1000000;
        }else if(dayStep == 12){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 2000000;
        }else if(dayStep == 13){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 3000000;
        }else if(dayStep == 14){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 4000000;
        }else if(dayStep == 15){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 5000000;
        }else if(dayStep == 16){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 6000000;
        }else if(dayStep == 17){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 7000000;
        }else if(dayStep == 18){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000) + 8000000;
        }else if(dayStep == 19){
            timeBucketCompressed = timeBucket - (timeBucket % 1000000)
    }}
}
