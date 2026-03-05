class Generated {
    public static byte convertHexDigit(byte b){
    if(b >= '0' && b <= '9') return (byte)(b - '0'); 
        else if(b >= 'A' && b <= 'F') return (byte)(10 + b - 'A'); 
        else if(b >= 'a' && b <= 'f') return (byte)(10 + b - 'a'); 
        else throw new IllegalArgumentException("Invalid hexadecimal digit: " + b); 
    }
}
