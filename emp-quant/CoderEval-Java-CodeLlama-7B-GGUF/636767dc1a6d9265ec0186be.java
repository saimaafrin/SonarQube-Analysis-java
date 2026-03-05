static long compressTimeBucket(long timeBucket,int dayStep){
long timeBucketCompressed = timeBucket;
    if(dayStep == 1){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000);
    }else if(dayStep == 11){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 100000000;
    }else if(dayStep == 12){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 200000000;
    }else if(dayStep == 13){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 300000000;
    }else if(dayStep == 14){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 400000000;
    }else if(dayStep == 15){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 500000000;
    }else if(dayStep == 16){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 600000000;
    }else if(dayStep == 17){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 700000000;
    }else if(dayStep == 18){
        timeBucketCompressed = timeBucket - (timeBucket % 100000000) + 800000000;
    }else if(dayStep
}