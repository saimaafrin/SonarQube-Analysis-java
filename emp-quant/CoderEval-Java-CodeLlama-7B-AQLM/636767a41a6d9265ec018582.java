public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
ProtobufOutput output = new ProtobufOutput(out);
    int size = schema.getSerializedSize(message,buffer);
    output.writeUInt32NoTag(size);
    schema.writeTo(output,message,buffer);
    return size;
}