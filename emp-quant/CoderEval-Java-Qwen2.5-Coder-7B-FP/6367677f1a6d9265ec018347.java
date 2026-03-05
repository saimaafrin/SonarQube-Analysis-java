public synchronized void send(final String message){
for (final Connection connection : connections) { 
        try {
            // Send the message followed by a newline character
            connection.getOutputStream().write((message + "\n").getBytes());
            connection.getOutputStream().flush();
        } catch (IOException e) {
            System.err.println("Error sending message: " + e.getMessage());
        }
    }
}