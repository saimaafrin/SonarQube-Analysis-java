class Generated {
    public static String trimLeadingWhitespace(String str){
    int len = str.length();
        int st = 0;
        while ((st < len) && (str.charAt(st) == ' '))
            st++;
        return str.substring(st, len);
    }
}
