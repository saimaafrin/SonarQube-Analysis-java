class Generated {
    public static String reverse(final String str){
    if(str == null){
            return null;
        }
        final char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            final char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
