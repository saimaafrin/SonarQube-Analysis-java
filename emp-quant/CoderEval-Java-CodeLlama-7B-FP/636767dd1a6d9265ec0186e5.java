class Generated {
    public void addNewTarget(Channels channels,IConsumer consumer){
    if(channels==null)
    		return;
    	if(channels.getChannel()==null)
    		return;
    	if(channels.getChannel().isEmpty())
    		return;
    	if(consumer==null)
    		return;
    	if(consumer.getConsumerId()==null)
    		return;
    	if(consumer.getConsumerId().isEmpty())
    		return;
    	if(this.consumeTargets==null)
    		this.consumeTargets=new HashMap<String,IConsumer>();
    	if(this.consumeTargets.containsKey(consumer.getConsumerId()))
    		return;
    	this.consumeTargets.put(consumer.getConsumerId(),consumer);
    	if(channels.getChannel().size()>0){
    		for(String channel:channels.getChannel()){
    			if(this.consumeChannels==null)
    				this.consumeChannels=new HashMap<String,Channels>();
    			if(this.consumeChannels.containsKey(channel))
    				this.consumeChannels.get(channel).addChannel(channel);
    			else
    				this.consumeChannels.put(channel,new Channels(channel));
    		}
    	}
    }
}
