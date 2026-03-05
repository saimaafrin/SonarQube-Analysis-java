public synchronized void send(final String message){
for(int i=0; i<clients.size(); i++){
        try{
            PrintWriter out = clients.get(i).getOutputStream();
            out.println(message);
            out.flush();
        }catch(IOException e){
            System.out.println("Error sending message: " + e.getMessage());
        }
    }
}