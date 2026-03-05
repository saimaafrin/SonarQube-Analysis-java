private static String javaCharset(String charset){
if(charset==null) return null;
	charset = charset.toLowerCase();
	if(charset.equals("us-ascii")) return "US-ASCII";
	if(charset.equals("utf-8")) return "UTF-8";
	if(charset.equals("utf-16")) return "UTF-16";
	if(charset.equals("utf-16be")) return "UTF-16BE";
	if(charset.equals("utf-16le")) return "UTF-16LE";
	if(charset.equals("utf-32")) return "UTF-32";
	if(charset.equals("utf-32be")) return "UTF-32BE";
	if(charset.equals("utf-32le")) return "UTF-32LE";
	if(charset.equals("windows-1252")) return "windows-1252";
	if(charset.equals("windows-1254")) return "windows-1254";
	if(charset.equals("windows-1250")) return "windows-1250";
	if(charset.equals("windows-1251")) return "windows-1251";
	if(charset.equals("windows-1253")) return "windows-1253";
	if(charset.equals("windows-1255")) return "windows-1255";
	if(charset.equals("windows-1256")) return "windows-1256";
	if(charset.equals("windows-1257")) return "windows-1257";
	if(charset.equals("windows-1258")) return "windows-1258";
	if(charset.equals("windows-874")) return "windows-874";
	if(charset.equals("windows-949")) return "windows-949";
	if(charset.equals("windows-950")) return "windows-950";
	if(charset.equals("x-euc-jp")) return "x-e
}