class Generated {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
    if(str==null||substring==null){  
            return false;  
        }  
        if(index<0||index>str.length()-substring.length()){  
            return false;  
        }  
        for(int i=0;i<substring.length();i++){  
            if(str.charAt(index+i)!=substring.charAt(i)){  
                return false;  
            }  
        }  
        return true;  
    }  
    ```
}
