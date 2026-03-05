class Generated {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
    ProtobufOutput<T> output = ProtobufOutput.create(buffer, schema);  
        int size = output.writeObject(message);  
        output.writeVarint32(size);  
        out.write(buffer.array(), 0, buffer.position());  
        return size;  
    }
}
