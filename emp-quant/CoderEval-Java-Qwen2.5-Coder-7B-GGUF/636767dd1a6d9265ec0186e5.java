public void addNewTarget(Channels channels,IConsumer consumer){
if(consumeTargets.containsKey(channels)){  
        consumeTargets.get(channels).add(consumer);  
    }else{  
        List<IConsumer> list = new ArrayList<IConsumer>();  
        list.add(consumer);  
        consumeTargets.put(channels, list);  
    }  
}  

**Explanation**:
In the provided code snippet, the method `addNewTarget` is designed to manage a mapping of `Channels` to a list of `IConsumer` objects. This mapping is stored in a `Map` called `consumeTargets`. The method takes two parameters: `channels` of type `Channels` and `consumer` of type `IConsumer`.

The method first checks if the `consumeTargets` map already contains an entry for the given `channels`. If it does, it adds the `consumer` to the existing list of consumers associated with that `channels`. If the `consumeTargets` map does not contain an entry for the given `channels`, it creates a new list, adds the `consumer` to this list, and then puts this list into the `consumeTargets` map with the `channels` as the key.

This approach ensures that each `Channels` can be associated with multiple `IConsumer` objects, allowing for a flexible and scalable system where multiple consumers can process messages from the same channel.