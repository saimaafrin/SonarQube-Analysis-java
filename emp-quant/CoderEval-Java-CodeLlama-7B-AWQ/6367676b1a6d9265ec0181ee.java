class Generated {
    public static String trimTrailingWhitespace(String str){
    int len = str.length();
        int st = 0;
    
        while ((st < len) && (str.charAt(len - 1) == ' ')) {
            len--;
        }
        return str.substring(st, len);
    }
}
