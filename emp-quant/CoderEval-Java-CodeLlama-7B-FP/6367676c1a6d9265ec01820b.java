public static String deleteAny(String inString,String charsToDelete){
StringBuffer sb = new StringBuffer(inString);
    for (int i = 0; i < charsToDelete.length(); i++) {
        sb.deleteCharAt(sb.indexOf(charsToDelete.charAt(i)));
    }
    return sb.toString();
}