class Generated {
    public static byte[] toPrimitive(final Byte[] array){
    if(array == null){
            return null;
        }
        byte[] out = new byte[array.length];
        for(int i = 0; i < array.length; i++){
            out[i] = array[i].byteValue();
        }
        return out;
    }
}
