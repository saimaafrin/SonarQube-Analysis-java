@Override public void accept(final METRICS data){
final String key = data.getId();
    final Optional<BufferedValue> oldValue = this.buffer.get(key);
    final BufferedValue newValue = new BufferedValue(data);

    if(oldValue.isPresent()){
        final BufferedValue combined = oldValue.get().combine(newValue);
        if(combined.isAbandoned()){
            this.buffer.remove(key);
        }else{
            this.buffer.put(key, combined);
        }
    }else{
        this.buffer.put(key, newValue);
    }
}

**The `BufferedValue` class:**

```java