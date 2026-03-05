static long compressTimeBucket(long timeBucket,int dayStep){
# Example usage of compressTimeBucket function
original_time_bucket = 20000112
day_step = 7
compressed_time_bucket = compressTimeBucket(original_time_bucket, day_step)
print(compressed_time_bucket)  # Output: 20000108

# Assuming TIME_BUCKET_FORMATTER is defined elsewhere in the code
formatted_time = TIME_BUCKET_FORMATTER.format(compressed_time_bucket)
print(formatted_time)  # Output: "2000-01-08"
}