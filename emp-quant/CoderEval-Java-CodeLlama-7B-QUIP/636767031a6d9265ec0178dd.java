public long contentLength(){
long contentLength = 0;
    try {
        contentLength = Long.parseLong(contentLengthHeader);
    } catch (NumberFormatException e) {
        contentLength = -1;
    }
    return contentLength;
}