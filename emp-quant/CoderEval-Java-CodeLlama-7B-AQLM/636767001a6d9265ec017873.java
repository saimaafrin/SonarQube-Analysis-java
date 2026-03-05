public static String reverse(final String str){
if(str == null || str.length() == 0){
        return str;
    }
    return new StringBuilder(str).reverse().toString();
}