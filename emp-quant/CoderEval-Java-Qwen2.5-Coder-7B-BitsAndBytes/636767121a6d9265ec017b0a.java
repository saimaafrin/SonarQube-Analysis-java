class Generated {
    private int parseEndOfLine(String headerPart,int end){
    while(end<headerPart.length()&&headerPart.charAt(end)!='\n'){  
            end++;  
        }  
        return end;  
    }  
    
    **Parse the header part starting from the given start position and return the parsed header as a string. The end position is determined by the parseEndOfLine method.**
}
