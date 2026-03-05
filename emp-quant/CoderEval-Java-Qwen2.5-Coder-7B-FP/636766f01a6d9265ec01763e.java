private static String javaCharset(String charset){
if(charset.equals("us-ascii")) return "US-ASCII";
    else if(charset.equals("iso-8859-1")) return "ISO-8859_1";
    else if(charset.equals("utf-8")) return "UTF-8";
    else if(charset.equals("utf-16")) return "UTF-16";
    else if(charset.equals("utf-16be")) return "UTF-16BE";
    else if(charset.equals("utf-16le")) return "UTF-16LE";
    else return null;
}