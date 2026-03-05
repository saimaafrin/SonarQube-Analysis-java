public void add(LoggingEvent event){
synchronized (buffer){
        if(buffer.size() >= maxSize){
            buffer.removeFirst();
        }
        buffer.addLast(event);
    }
} 

**Explanation:**
- The `add` method is designed to add a new `LoggingEvent` to the end of a circular buffer.
- It uses a `synchronized` block to ensure that only one thread can modify the buffer at a time, preventing concurrent modification exceptions.
- Inside the synchronized block:
  - It checks if the buffer size has reached or exceeded the maximum size (`maxSize`). If so, it removes the oldest event from the front of the buffer using `removeFirst()`.
  - Then, it adds the new event to the end of the buffer using `addLast()`.

This approach ensures that the buffer maintains its fixed size by removing the oldest events when new ones are added, thus preventing the buffer from growing indefinitely.