static long compressTimeBucket(long timeBucket,int dayStep){
static long compressTimeBucket(long timeBucket, int dayStep) {
    int year = (int) (timeBucket / 10000);
    int month = (int) ((timeBucket - year * 10000) / 100);
    int day = (int) (timeBucket % 100);
    int newDay = day - (day - 1) % dayStep;
    return year * 10000 + month * 100 + newDay;
}
}