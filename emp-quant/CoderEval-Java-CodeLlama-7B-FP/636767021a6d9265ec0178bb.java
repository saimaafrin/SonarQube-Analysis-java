public static Double[] nullToEmpty(final Double[] array){
return (array != null && array.length > 0) ? array : EMPTY_DOUBLE_OBJECT_ARRAY;
}