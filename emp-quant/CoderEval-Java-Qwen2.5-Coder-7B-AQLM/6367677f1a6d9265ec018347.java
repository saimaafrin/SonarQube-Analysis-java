class Generated {
    public synchronized void send(final String message){
    for(final Connection conn : connections){ 
            conn.send(message); 
        } 
    }
}
