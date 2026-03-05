@Override public void accept(final METRICS data){
if (buffer.containsKey(data.getId())) {
        // Combine the data with the existing data
        METRICS existingData = buffer.get(data.getId());
        existingData = existingData.combine(data);
        // If the combined data is abandoned, remove it from the buffer
        if (existingData.isAbandoned()) {
            buffer.remove(data.getId());
        } else {
            buffer.put(data.getId(), existingData);
        }
    } else {
        // If the data does not exist in the buffer, add it to the buffer
        buffer.put(data.getId(), data);
    }
}