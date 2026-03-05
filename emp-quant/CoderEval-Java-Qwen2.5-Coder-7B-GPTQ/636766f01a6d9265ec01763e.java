class Generated {
    private static String javaCharset(String charset){
    if(charset.equals("us-ascii")) return "US-ASCII";
        else if(charset.equals("iso-8859-1")) return "ISO-8859_1";
        else if(charset.equals("utf-8")) return "UTF-8";
        else if(charset.equals("windows-1252")) return "Cp1252";
        else throw new IllegalArgumentException("Unknown charset: "+charset);
    }
}
