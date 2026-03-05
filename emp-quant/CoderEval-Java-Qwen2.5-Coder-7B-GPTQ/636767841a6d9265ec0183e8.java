public void add(LoggingEvent event){
synchronized (buffer){
        if(buffer.size() >= maxEvents){
            buffer.removeFirst();
        }
        buffer.addLast(event);
    }
} 

**Explanation:**
The `add` method is designed to insert a new `LoggingEvent` into a circular buffer, ensuring that the buffer does not exceed its maximum capacity (`maxEvents`). Here's how it works:

1. **Synchronization**: The method uses a synchronized block on the `buffer` object to ensure thread safety when adding events. This prevents multiple threads from modifying the buffer at the same time.

2. **Capacity Check**: Before adding the new event, the method checks if the buffer has reached its maximum size (`maxEvents`). If it has, the oldest event (the first element in the buffer) is removed using `removeFirst()`.

3. **Adding Event**: If the buffer is not full, the new event is added to the end of the buffer using `addLast()`.

This approach ensures that the buffer maintains a fixed number of recent events and avoids memory overflow by removing old events when necessary.