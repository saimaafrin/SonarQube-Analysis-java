public static char[] clone(final char[] array){
if(array == null){
        return null;
    }
    return (char[]) array.clone();
}