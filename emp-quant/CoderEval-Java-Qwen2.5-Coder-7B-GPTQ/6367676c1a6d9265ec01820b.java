public static String deleteAny(String inString,String charsToDelete){
for(int i=0;i<inString.length();i++){  
        if(charsToDelete.indexOf(inString.charAt(i))!=-1){  
            inString=inString.substring(0,i)+inString.substring(i+1);  
            i--;  
        }  
    }  
    return inString;  
}