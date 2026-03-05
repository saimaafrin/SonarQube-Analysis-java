class Generated {
    public static String deleteAny(String inString,String charsToDelete){
    StringBuilder sb = new StringBuilder(inString);
        for(int i = 0; i < charsToDelete.length(); i++){
            sb.delete(sb.indexOf(charsToDelete.charAt(i)),sb.indexOf(charsToDelete.charAt(i))+1);
        }
        return sb.toString();
    }
}
