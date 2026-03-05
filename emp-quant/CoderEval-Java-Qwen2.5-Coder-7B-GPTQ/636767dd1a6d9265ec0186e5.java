class Generated {
    public void addNewTarget(Channels channels,IConsumer consumer){
    if(consumeTargets.containsKey(channels)){  
            consumeTargets.get(channels).add(consumer);  
        }else{  
            List<IConsumer> list = new ArrayList<>();  
            list.add(consumer);  
            consumeTargets.put(channels,list);  
        }  
    }  
    
    **Explanation:**
    The method `addNewTarget` is designed to manage a mapping between `Channels` and lists of `IConsumer`. Here's how it works:
    
    1. **Check Existing Entry**: The method first checks if there is already an entry for the given `channels` in the `consumeTargets` map.
       - If such an entry exists, it simply adds the new `consumer` to the existing list associated with that `channels`.
    
    2. **Create New Entry**: If no entry exists for the given `channels`, the method creates a new entry:
       - It initializes a new `ArrayList` and adds the new `consumer` to this list.
       - Then, it puts this new list into the `consumeTargets` map under the key of the given `channels`.
    
    This approach ensures that each `channels` can have multiple consumers associated with it, and it efficiently handles both adding to existing entries and creating new ones.
}
