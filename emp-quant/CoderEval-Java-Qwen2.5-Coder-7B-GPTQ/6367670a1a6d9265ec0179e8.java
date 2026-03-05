public static Boolean[] nullToEmpty(final Boolean[] array){
if(array == null || array.length == 0){
        return new Boolean[0];
    }
    return array;
}