private static String javaCharset(String charset){
if(charset == null) return null;
    if(charset.equalsIgnoreCase("utf-8")) return "UTF-8";
    if(charset.equalsIgnoreCase("utf8")) return "UTF-8";
    if(charset.equalsIgnoreCase("unicode")) return "UTF-16";
    if(charset.equalsIgnoreCase("unicode-1-1-utf-8")) return "UTF-8";
    if(charset.equalsIgnoreCase("windows-1252")) return "ISO-8859-1";
    if(charset.equalsIgnoreCase("iso-8859-1")) return "ISO-8859-1";
    if(charset.equalsIgnoreCase("iso-8859-2")) return "ISO-8859-2";
    if(charset.equalsIgnoreCase("iso-8859-3")) return "ISO-8859-3";
    if(charset.equalsIgnoreCase("iso-8859-4")) return "ISO-8859-4";
    if(charset.equalsIgnoreCase("iso-8859-5")) return "ISO-8859-5";
    if(charset.equalsIgnoreCase("iso-8859-6")) return "ISO-8859-6";
    if(charset.equalsIgnoreCase("iso-8859-7")) return "ISO-8859-7";
    if(charset.equalsIgnoreCase("iso-8859-8")) return "ISO-8859-8";
    if(charset.equalsIgnoreCase("iso-8859-9")) return "ISO-8859-9";
    if(charset.equalsIgnoreCase("iso-8859-10")) return "ISO-8859-10";
    if(charset.equalsIgnoreCase("iso-8859-11")) return "ISO-8859-11";
    if(charset.equalsIgnoreCase("iso-8859-13")) return "ISO-8859-13";
    if
}