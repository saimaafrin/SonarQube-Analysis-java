static long compressTimeBucket(long timeBucket,int dayStep){
long reformatTimeBucket = timeBucket;  
    if(dayStep > 0){  
        reformatTimeBucket = timeBucket - (timeBucket % dayStep);  
    }else if(dayStep < 0){  
        reformatTimeBucket = timeBucket - (timeBucket % (-dayStep));  
    }  
    return reformatTimeBucket;  
}  

static String TIME_BUCKET_FORMATTER = "yyyyMMdd";  
static SimpleDateFormat sdf = new SimpleDateFormat(TIME_BUCKET_FORMATTER);