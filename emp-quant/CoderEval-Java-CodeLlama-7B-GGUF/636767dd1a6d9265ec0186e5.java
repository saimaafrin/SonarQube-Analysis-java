class Generated {
    public void addNewTarget(Channels channels,IConsumer consumer){
    if(channels==null)
    		return;
    	if(channels.getTargets()==null)
    		return;
    	if(channels.getTargets().size()==0)
    		return;
    	if(consumer==null)
    		return;
    	if(this.consumeTargets==null)
    		this.consumeTargets=new ArrayList<IConsumer>();
    	for(Channel channel:channels.getTargets()){
    		if(channel==null)
    			continue;
    		if(this.consumeTargets.contains(channel))
    			continue;
    		this.consumeTargets.add(channel);
    	}
    }
}
