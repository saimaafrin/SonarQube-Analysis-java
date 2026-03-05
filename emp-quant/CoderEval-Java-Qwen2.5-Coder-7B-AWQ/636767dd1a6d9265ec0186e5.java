class Generated {
    public void addNewTarget(Channels channels,IConsumer consumer){
    if(consumeTargets.containsKey(channels)){  
            //If the channel already exists, add the consumer to the existing list
            List<IConsumer> consumers = consumeTargets.get(channels);  
            consumers.add(consumer);  
        } else {  
            //If the channel does not exist, create a new list and add the consumer
            List<IConsumer> consumers = new ArrayList<>();  
            consumers.add(consumer);  
            consumeTargets.put(channels,consumers);  
        }  
    }  
    
    **Explanation:**
    - The method `addNewTarget` takes two parameters: `channels` (an instance of `Channels`) and `consumer` (an instance of `IConsumer`).
    - It checks if the `consumeTargets` map already contains an entry for the given `channels`.
      - If it does, it retrieves the list of consumers associated with that channel and adds the new `consumer` to this list.
      - If it doesn't, it creates a new list containing only the `consumer`, and then associates this list with the `channels` in the `consumeTargets` map.
    - This ensures that all consumers interested in a particular set of channels are stored together, making it easier to manage and notify them when relevant events occur on those channels.
}
