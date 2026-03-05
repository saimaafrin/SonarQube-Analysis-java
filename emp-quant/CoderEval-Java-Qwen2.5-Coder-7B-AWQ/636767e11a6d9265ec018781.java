@Override public void accept(final METRICS data){
final String key = data.getId();
    final long timestamp = data.getTimestamp();
    final double value = data.getValue();

    // Check if the key already exists in the buffer
    if (buffer.containsKey(key)) {
        // Combine the new value with the existing value
        final double oldValue = buffer.get(key);
        final double newValue = oldValue + value;

        // Remove the old entry from the buffer
        buffer.remove(key);

        // Add the new combined value back into the buffer
        buffer.put(key, newValue);
    } else {
        // If the key does not exist, simply add the new data to the buffer
        buffer.put(key, value);
    }

    // Optionally, you can also check if the buffer size exceeds a certain threshold and perform cleanup or other actions
    if (buffer.size() > MAX_BUFFER_SIZE) {
        // Perform cleanup or other actions here
        // For example, you could remove entries that are older than a certain time period
        buffer.entrySet().removeIf(entry -> System.currentTimeMillis() - entry.getValue().getTimestamp() > MAX_ENTRY_AGE);
    }
}