public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
ProtobufOutput output = new ProtobufOutput(out,buffer);
    int size = writeDelimitedTo(output,message,schema);
    output.flush();
    return size;
}