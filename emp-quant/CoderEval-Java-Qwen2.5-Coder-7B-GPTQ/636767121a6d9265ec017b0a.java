private int parseEndOfLine(String headerPart,int end){
while(end<headerPart.length()&&headerPart.charAt(end)!='\n'){  
        end++;  
    }  
    return end;  
}  

**This function is used to parse a line in the header part and extract the key-value pair. It returns an array where the first element is the key and the second element is the value. If there's no value, it returns null for the value.**