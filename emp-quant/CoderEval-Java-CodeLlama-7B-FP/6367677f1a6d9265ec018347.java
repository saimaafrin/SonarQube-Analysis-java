public synchronized void send(final String message){
if(message==null) return;
	for(final Session S : sessions.values())
		if(S!=null)
			S.send(message);
}