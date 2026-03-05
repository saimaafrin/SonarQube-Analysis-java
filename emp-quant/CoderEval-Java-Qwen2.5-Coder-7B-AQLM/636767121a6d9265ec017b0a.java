class Generated {
    private int parseEndOfLine(String headerPart,int end){
    int index = end;  
        while(index >= 0){  
            if(headerPart.charAt(index) == '\n'){  
                return index;  
            }  
            index--;  
        }  
        return -1;  
    }
}
