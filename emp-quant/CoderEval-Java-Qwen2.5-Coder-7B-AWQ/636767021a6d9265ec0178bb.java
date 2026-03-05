public static Double[] nullToEmpty(final Double[] array){
if(array == null || array.length == 0){
        return EMPTY_CHARACTER_OBJECT_ARRAY;
    }else{
        return array;
    }
}