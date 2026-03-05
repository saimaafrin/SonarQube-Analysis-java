public static char[] clone(final char[] array){
if(array == null){
        return null;
    }
    final char[] result = new char[array.length];
    System.arraycopy(array, 0, result, 0, array.length);
    return result; 
}