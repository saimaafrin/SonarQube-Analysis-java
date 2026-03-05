class Generated {
    public static String deleteAny(String inString,String charsToDelete){
    char[] strArray = inString.toCharArray(); 
        for(int i=0;i<strArray.length;i++){ 
            if(charsToDelete.indexOf(strArray[i]) != -1){ 
                strArray[i] = ' '; 
            } 
        } 
        return new String(strArray).replaceAll("\\s+",""); 
    }
}
