class Generated {
    public static int indexOfExtension(String filename){
    int lastDotIndex = -1;
        int lastSeparatorIndex = -1;
        int length = filename.length();
        for (int i = 0; i < length; i++) {
            char c = filename.charAt(i);
            if (c == '.') {
                lastDotIndex = i;
            } else if (c == File.separatorChar) {
                lastSeparatorIndex = i;
                break;
            }
        }
        return lastSeparatorIndex > lastDotIndex ? -1 : lastDotIndex;
    }
}
