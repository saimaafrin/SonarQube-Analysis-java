public static String reverse(final String str){
if(str == null){
        return null;
    }
    final char[] arr = str.toCharArray();
    for(int i = 0, j = arr.length - 1; i < j; i++, j--){
        final char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
    return new String(arr);
}