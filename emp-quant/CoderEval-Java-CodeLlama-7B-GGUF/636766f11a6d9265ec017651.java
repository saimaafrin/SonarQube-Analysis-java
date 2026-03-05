public static Character[] nullToEmpty(final Character[] array){
return (array == null || array.length == 0) ? EMPTY_CHARACTER_OBJECT_ARRAY : array;
}