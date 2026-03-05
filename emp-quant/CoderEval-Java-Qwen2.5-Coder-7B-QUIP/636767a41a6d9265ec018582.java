public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
ProtobufOutput.output(out, schema, message, buffer);  
    return ProtobufOutput.delimitedSize(buffer);  
}  

**Use ProtobufOutput and the LinkedBuffer to write the message into the given OutputStream out, and return the message size.**