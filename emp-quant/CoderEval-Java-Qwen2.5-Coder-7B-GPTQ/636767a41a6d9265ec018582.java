public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
ProtobufOutput output = new ProtobufOutput(buffer);  
    int size = schema.writeDelimitedTo(output,message);  
    output.flushBuffer();  
    out.write(buffer.array(),0,size);  
    return size;  
}