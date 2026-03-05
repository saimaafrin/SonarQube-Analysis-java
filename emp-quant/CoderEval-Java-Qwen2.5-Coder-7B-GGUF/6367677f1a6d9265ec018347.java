class Generated {
    public synchronized void send(final String message){
    for(final Connection connection : connections){ 
            connection.send(message); 
        } 
    }
}
