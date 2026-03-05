class Generated {
    public static int indexOfExtension(String filename){
    int extensionIndex = filename.lastIndexOf(EXTENSION_SEPARATOR);
    	int lastSeparatorIndex = indexOfLastSeparator(filename);
    	return lastSeparatorIndex > extensionIndex ? -1 : extensionIndex;
    }
}
