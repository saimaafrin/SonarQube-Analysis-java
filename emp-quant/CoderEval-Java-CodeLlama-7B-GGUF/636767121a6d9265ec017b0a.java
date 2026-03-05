class Generated {
    private int parseEndOfLine(String headerPart,int end){
    int index=end;
        while(index<headerPart.length()){
            if(headerPart.charAt(index)=='\r' && headerPart.charAt(index+1)=='\n'){
                return index;
            }
            index++;
        }
        return -1;
    }
}
