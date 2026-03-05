class Generated {
    private int parseEndOfLine(String headerPart,int end){
    int i = end;  
        while (i >= 0) {  
            if (headerPart.charAt(i) == '\n') {  
                return i;  
            }  
            i--;  
        }  
        return -1;  
    }
}
