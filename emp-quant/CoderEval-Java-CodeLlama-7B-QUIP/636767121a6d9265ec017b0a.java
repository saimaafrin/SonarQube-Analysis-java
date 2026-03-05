private int parseEndOfLine(String headerPart,int end){
int index=end;
    while(index<headerPart.length()){
        if(headerPart.charAt(index)=='\r'){
            if(headerPart.charAt(index+1)=='\n'){
                index+=2;
                return index;
            }
        }
        index++;
    }
    return -1;
}