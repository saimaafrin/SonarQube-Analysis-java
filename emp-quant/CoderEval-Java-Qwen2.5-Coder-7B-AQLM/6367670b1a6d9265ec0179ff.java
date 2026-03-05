public static Byte[] nullToEmpty(final Byte[] array){
return array == null || array.length == 0 ? EMPTY_BYTE_OBJECT_ARRAY : array;
}