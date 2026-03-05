public void addNewTarget(Channels channels,IConsumer consumer){
if(channels==null)
		return;
	if(channels.getChannel()==null)
		return;
	if(channels.getChannel().size()==0)
		return;
	if(consumer==null)
		return;
	if(consumer.getConsumeTargets()==null)
		return;
	if(consumer.getConsumeTargets().size()==0)
		return;
	if(this.getConsumeTargets()==null)
		return;
	if(this.getConsumeTargets().size()==0)
		return;
	for(Channel channel:channels.getChannel()){
		if(channel==null)
			continue;
		if(channel.getId()==null)
			continue;
		if(channel.getId().length()==0)
			continue;
		if(this.getConsumeTargets().containsKey(channel.getId()))
			continue;
		this.getConsumeTargets().put(channel.getId(), channel);
	}
}