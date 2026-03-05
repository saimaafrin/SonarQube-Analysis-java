static long compressTimeBucket(long timeBucket,int dayStep){
static long compressTimeBucket(long timeBucket, int dayStep) {
    String timeStr = Long.toString(timeBucket);
    int year = Integer.parseInt(timeStr.substring(0, 4));
    int month = Integer.parseInt(timeStr.substring(4, 6));
    int day = Integer.parseInt(timeStr.substring(6, 8));

    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);

    // Calculate the number of days to subtract considering the day of the week
    int daysToSubtract = (dayStep + calendar.get(Calendar.DAY_OF_WEEK)) % 7;
    calendar.add(Calendar.DAY_OF_MONTH, -daysToSubtract);

    // Subtract the remaining daysStep
    calendar.add(Calendar.DAY_OF_MONTH, -dayStep);

    return calendar.get(Calendar.YEAR) * 10000L + calendar.get(Calendar.MONTH) + 1 * 100L + calendar.get(Calendar.DAY_OF_MONTH);
}
}