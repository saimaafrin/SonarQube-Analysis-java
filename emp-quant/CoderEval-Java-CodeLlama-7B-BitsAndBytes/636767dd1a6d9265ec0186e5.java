public void addNewTarget(Channels channels,IConsumer consumer){
if(channels==null)
		return;
	if(channels.getChannel()==null)
		return;
	if(channels.getChannel().isEmpty())
		return;
	if(consumer==null)
		return;
	if(consumer.getConsumeTargets()==null)
		return;
	if(consumer.getConsumeTargets().isEmpty())
		return;
	if(this.consumeTargets==null)
		this.consumeTargets=new ArrayList<IConsumeTarget>();
	for(Channel channel:channels.getChannel()){
		if(channel==null)
			continue;
		if(channel.getId()==null)
			continue;
		if(channel.getId().isEmpty())
			continue;
		IConsumeTarget consumeTarget=new ConsumeTarget(channel.getId(),consumer);
		if(this.consumeTargets.contains(consumeTarget))
			continue;
		this.consumeTargets.add(consumeTarget);
	}
}