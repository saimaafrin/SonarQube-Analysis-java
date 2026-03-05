public void addNewTarget(Channels channels,IConsumer consumer){
if(channels==null){
		return;
	}
	if(channels.getChannel()==null){
		return;
	}
	if(channels.getChannel().size()==0){
		return;
	}
	if(consumer==null){
		return;
	}
	for(int i=0;i<channels.getChannel().size();i++){
		consumer.consume(channels.getChannel().get(i));
	}
}