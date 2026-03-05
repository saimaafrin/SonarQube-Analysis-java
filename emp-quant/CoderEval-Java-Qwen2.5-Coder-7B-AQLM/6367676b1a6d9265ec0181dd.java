class Generated {
    public static int countOccurrencesOf(String str,String sub){
    int count=0;  
        int lastIndex=0;  
        while(lastIndex != -1){  
            lastIndex = str.indexOf(sub,lastIndex);  
            if(lastIndex != -1){  
                count++;  
                lastIndex += sub.length();  
            }  
        }  
        return count;  
    }
}
