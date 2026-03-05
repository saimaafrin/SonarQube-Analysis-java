class Generated {
    public final byte[] toByteArray(){
    if (length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        int size = length;
        byte[] result = new byte[size];
        for (int i = 0; i < size; ++i) {
            result[i] = buffer.get(i);
        }
        return result;
    }
}
