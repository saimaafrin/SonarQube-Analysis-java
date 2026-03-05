public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
ProtobufOutput output = new ProtobufOutput(buffer);  
    int size = schema.getSerializedSize(message);  
    output.writeInt32NoTag(size);  
    schema.writeTo(output, message);  
    byte[] bytes = buffer.toByteArray();  
    out.write(bytes);  
    return size;  
}