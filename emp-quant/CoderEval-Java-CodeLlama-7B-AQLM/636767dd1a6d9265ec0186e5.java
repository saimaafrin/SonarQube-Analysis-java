public void addNewTarget(Channels channels,IConsumer consumer){
if(channels==null) return;
	if(consumer==null) return;
	if(channels.isEmpty()) return;
	if(consumer.getConsumeTargets()==null) return;
	if(consumer.getConsumeTargets().isEmpty()) return;
	
	for(Channel channel:channels){
		if(channel==null) continue;
		if(consumer.getConsumeTargets().contains(channel)) continue;
		consumer.getConsumeTargets().add(channel);
	}
}