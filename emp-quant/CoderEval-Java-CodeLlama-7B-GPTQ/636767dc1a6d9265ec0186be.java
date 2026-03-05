class Generated {
    static long compressTimeBucket(long timeBucket,int dayStep){
    long year = timeBucket / 10000;
        long month = (timeBucket - year * 10000) / 100;
        long day = timeBucket - year * 10000 - month * 100;
        long hour = day * 24;
        long minute = hour * 60;
        long second = minute * 60;
        long millisecond = second * 1000;
        long microsecond = millisecond * 1000;
        long nanosecond = microsecond * 1000;
        long reformatTimeBucket = year * 10000 + month * 100 + day - dayStep * 100;
        return reformatTimeBucket;
    }
}
