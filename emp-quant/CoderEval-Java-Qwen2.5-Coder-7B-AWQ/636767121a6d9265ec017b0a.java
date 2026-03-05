class Generated {
    private int parseEndOfLine(String headerPart,int end){
    while(end>0 && headerPart.charAt(end-1) != '\n'){  
            end--;  
        }  
        return end;  
    }
}
