public synchronized void send(final String message){
for(final Connection c : connections){
        c.send(message);
    }
}