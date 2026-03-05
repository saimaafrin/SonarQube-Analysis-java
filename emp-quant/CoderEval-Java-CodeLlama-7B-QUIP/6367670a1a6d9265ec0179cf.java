public static char toChar(final Character ch,final char defaultValue){
if(ch==null){
		return defaultValue;
	}
	return ch.charValue();
}