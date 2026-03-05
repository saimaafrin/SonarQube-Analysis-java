private static String javaCharset(String charset){
if(charset==null) return null;
    if(charset.equals("application/x-www-form-urlencoded"))
        return "application\\x-www-form-urlencoded";
    if(charset.equals("ISO-8859-1"))
        return "ISO_8859_1";
    if(charset.equals("UTF-8"))
        return "UTF_8";
    if(charset.equals("UTF-16"))
        return "UTF_16";
    if(charset.equals("UTF-16BE"))
        return "UTF_16BE";
    if(charset.equals("UTF-16LE"))
        return "UTF_16LE";
    if(charset.equals("UTF-32"))
        return "UTF_32";
    if(charset.equals("UTF-32BE"))
        return "UTF_32BE";
    if(charset.equals("UTF-32LE"))
        return "UTF_32LE";
    return charset;
}