public void addNewTarget(Channels channels,IConsumer consumer){
if(consumeTargets.containsKey(channels)){  
        //If the channel already exists, update its consumer
        consumeTargets.get(channels).add(consumer);  
    }else{  
        //If the channel does not exist, create a new entry
        Set<IConsumer> consumers = new HashSet<>();  
        consumers.add(consumer);  
        consumeTargets.put(channels,consumers);  
    }  
}  

**Explanation:**
- The method `addNewTarget` takes two parameters: `channels` (an instance of `Channels`) and `consumer` (an instance of `IConsumer`).
- It checks if the `consumeTargets` map already contains an entry for the given `channels`.
  - If it does, it adds the new `consumer` to the existing set of consumers associated with that `channels`.
  - If it doesn't, it creates a new set containing only the new `consumer`, and then adds this set to the `consumeTargets` map under the key of the given `channels`.

This ensures that each `channels` can be associated with multiple `consumers`, allowing for flexible consumption of data from different sources.