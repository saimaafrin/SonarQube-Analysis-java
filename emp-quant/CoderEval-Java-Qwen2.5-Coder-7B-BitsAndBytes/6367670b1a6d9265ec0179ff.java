public static Byte[] nullToEmpty(final Byte[] array){
if(array == null || array.length == 0){
        return new Byte[0];
    }
    return array;
}