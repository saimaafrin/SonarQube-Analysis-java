class Generated {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
    ProtobufOutput<T> output = ProtobufOutput.forBuffer(buffer, schema);  
        int size = output.writeObject(message);  
        output.finishDelimitedTo(out);  
        return size;  
    }
}
