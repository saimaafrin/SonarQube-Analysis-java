public void addNewTarget(Channels channels,IConsumer consumer){
if (consumeTargets==null) {
    consumeTargets = new ArrayList<IConsumer>();
  }
  for (Channel channel : channels) {
    if (channel instanceof IConsumer) {
      consumeTargets.add((IConsumer) channel);
    }
  }
}
```
This code snippet is a method that adds new target channels to a list of consumeTargets. It checks if the consumeTargets list is null and initializes it if necessary. Then, it iterates through the given channels, checks if each channel is an instance of IConsumer, and if so, adds it to the consumeTargets list. This allows for dynamic addition of consumer channels to the system.