public synchronized void send(final String message){
for(final Session session : sessions){
		session.send(message);
	}
}