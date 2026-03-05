class Generated {
    public static <T>int writeDelimitedTo(OutputStream out,T message,Schema<T> schema,LinkedBuffer buffer) throws IOException {
    ProtobufOutput output = new ProtobufOutput(out,buffer);
        output.writeDelimitedMessage(message,schema);
        return output.size();
    }
}
