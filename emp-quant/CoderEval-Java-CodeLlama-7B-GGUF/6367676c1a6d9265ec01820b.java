class Generated {
    public static String deleteAny(String inString,String charsToDelete){
    StringBuilder sb = new StringBuilder(inString);
        for(int i = 0; i < charsToDelete.length(); i++){
            for(int j = 0; j < inString.length(); j++){
                if(charsToDelete.charAt(i) == inString.charAt(j)){
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        return sb.toString();
    }
}
