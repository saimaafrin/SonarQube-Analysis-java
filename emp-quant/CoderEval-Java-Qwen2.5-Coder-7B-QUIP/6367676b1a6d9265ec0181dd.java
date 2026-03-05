public static int countOccurrencesOf(String str,String sub){
int lastIndex=0;  
    int count=0;  
    while(lastIndex!=-1){  
        lastIndex=str.indexOf(sub,lastIndex);  
        if(lastIndex>=0){  
            count++;  
            lastIndex+=1;  
        }  
    }  
    return count;  
}