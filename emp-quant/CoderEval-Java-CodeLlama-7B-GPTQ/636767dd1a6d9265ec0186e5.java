class Generated {
    public void addNewTarget(Channels channels,IConsumer consumer){
    if(channels==null) return;
    	if(channels.getChannel()==null) return;
    	if(channels.getChannel().size()==0) return;
    	if(consumer==null) return;
    	if(consumer.getConsumeTargets()==null) return;
    	if(consumer.getConsumeTargets().getConsumeTarget()==null) return;
    	if(consumer.getConsumeTargets().getConsumeTarget().size()==0) return;
    	
    	for(int i=0;i<channels.getChannel().size();i++){
    		Channel channel=channels.getChannel().get(i);
    		if(channel==null) continue;
    		if(channel.getId()==null) continue;
    		if(channel.getId().trim().equals("")) continue;
    		
    		ConsumeTarget consumeTarget=new ConsumeTarget();
    		consumeTarget.setChannelId(channel.getId());
    		consumeTarget.setConsumerId(consumer.getId());
    		
    		if(consumer.getConsumeTargets().getConsumeTarget().size()==0){
    			consumer.getConsumeTargets().getConsumeTarget().add(consumeTarget);
    		}else{
    			boolean isExist=false;
    			for(int j=0;j<consumer.getConsumeTargets().getConsumeTarget().size();j++){
    				if(consumer.getConsumeTargets().getConsumeTarget().get(j).getChannelId().equals(channel.getId())){
    					isExist=true;
    					break;
    				}
    			}
    			if(!isExist){
    				consumer.getConsumeTargets().getConsumeTarget().add(consumeTarget);
    			}
    		}
    	}
    }
}
