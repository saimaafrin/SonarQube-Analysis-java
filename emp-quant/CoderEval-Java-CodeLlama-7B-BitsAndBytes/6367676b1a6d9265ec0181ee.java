class Generated {
    public static String trimTrailingWhitespace(String str){
    int index = str.length() - 1;
        while (index >= 0 && Character.isWhitespace(str.charAt(index))) {
            index--;
        }
        return str.substring(0, index + 1);
    }
}
