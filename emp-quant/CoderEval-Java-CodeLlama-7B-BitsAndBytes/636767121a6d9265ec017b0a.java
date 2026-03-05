private int parseEndOfLine(String headerPart,int end){
int index=end;
    while(index<headerPart.length()){
        if(headerPart.charAt(index)=='\r'){
            if(index+1<headerPart.length() && headerPart.charAt(index+1)=='\n'){
                return index+2;
            }
            return index+1;
        }
        index++;
    }
    return index;
}