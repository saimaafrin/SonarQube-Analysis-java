class Generated {
    private static String javaCharset(String charset){
    if(charset==null) return null;
    	charset = charset.toLowerCase();
    	if(charset.equals("iso-8859-1")) return "ISO-8859-1";
    	if(charset.equals("us-ascii")) return "US-ASCII";
    	if(charset.equals("utf-8")) return "UTF-8";
    	if(charset.equals("utf-16")) return "UTF-16";
    	if(charset.equals("utf-16be")) return "UTF-16BE";
    	if(charset.equals("utf-16le")) return "UTF-16LE";
    	if(charset.equals("utf-32")) return "UTF-32";
    	if(charset.equals("utf-32be")) return "UTF-32BE";
    	if(charset.equals("utf-32le")) return "UTF-32LE";
    	return charset;
    }
}
