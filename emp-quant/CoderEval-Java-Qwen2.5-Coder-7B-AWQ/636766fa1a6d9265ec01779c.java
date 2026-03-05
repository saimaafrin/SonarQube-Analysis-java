private String parseToken(final char[] terminators){
StringBuilder sb = new StringBuilder();
    while (this.hasNext()){
        char c = this.nextChar(); // Get next character
        if (c == '\n' || c == '\r'){
            break; // Stop at newline or carriage return
        }
        boolean foundTerminator = false;
        for (char terminator : terminators){
            if (c == terminator){
                foundTerminator = true;
                break;
            }
        }
        if (foundTerminator){
            break; // Stop at terminator
        } else {
            sb.append(c); // Append character to token
        }
    }
    return sb.toString().trim(); // Return trimmed token
}