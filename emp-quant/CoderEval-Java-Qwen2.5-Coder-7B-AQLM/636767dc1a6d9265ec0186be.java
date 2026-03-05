static long compressTimeBucket(long timeBucket,int dayStep){
long timeBucketFormatter = 0;  
    if(dayStep == 1){  
        timeBucketFormatter = timeBucket;  
    }else if(dayStep == 2){  
        timeBucketFormatter = timeBucket - (timeBucket % 10);  
    }else if(dayStep == 3){  
        timeBucketFormatter = timeBucket - (timeBucket % 100);  
    }else if(dayStep == 4){  
        timeBucketFormatter = timeBucket - (timeBucket % 1000);  
    }else if(dayStep == 5){  
        timeBucketFormatter = timeBucket - (timeBucket % 10000);  
    }else if(dayStep == 6){  
        timeBucketFormatter = timeBucket - (timeBucket % 100000);  
    }else if(dayStep == 7){  
        timeBucketFormatter = timeBucket - (timeBucket % 1000000);  
    }else if(dayStep == 8){  
        timeBucketFormatter = timeBucket - (timeBucket % 10000000);  
    }else if(dayStep == 9){  
        timeBucketFormatter = timeBucket - (timeBucket % 100000000);  
    }else if(dayStep == 10){  
        timeBucketFormatter = timeBucket - (timeBucket % 1000000000);  
    }else if(dayStep == 11){  
        timeBucketFormatter = timeBucket - (timeBucket % 10000000000);  
    }else if(dayStep == 12){  
        timeBucketFormatter = timeBucket - (timeBucket % 100000000000);  
    }else if(dayStep == 13){  
        timeBucketFormatter = timeBucket - (timeBucket % 1000000000000);  
    }else if(dayStep == 14){  
        timeBucketFormatter = timeBucket - (timeBucket % 10000000000000);  
    }else if(dayStep == 15){  
        timeBucketFormatter = timeBucket - (timeBucket % 10000000000
}}