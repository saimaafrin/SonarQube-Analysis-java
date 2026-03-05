class Generated {
    public static String trimTrailingWhitespace(String str){
    int len = str.length();
        int st = 0;
        char[] val = str.toCharArray();
    
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < str.length())) ? str.substring(st, len) : str;
    }
}
