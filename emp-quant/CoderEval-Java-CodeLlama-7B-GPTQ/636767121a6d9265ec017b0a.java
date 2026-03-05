private int parseEndOfLine(String headerPart,int end){
int index = end;
    while(index < headerPart.length() && headerPart.charAt(index) != '\r'){
        index++;
    }
    return index;
}