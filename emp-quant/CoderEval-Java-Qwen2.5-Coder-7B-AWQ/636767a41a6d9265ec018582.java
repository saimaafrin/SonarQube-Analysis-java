class Generated {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
    ProtobufOutput output = new ProtobufOutput(buffer);  
        int size = schema.writeTo(output, message);  
        output.finish();  
        out.write(buffer.buffer(), 0, buffer.offset());  
        return size;  
    }
}
