public static int indexOfExtension(String filename){
int len = filename.length();
    int sep = -1;
    for (int i = len - 1; i >= 0; i--) {
        char c = filename.charAt(i);
        if (c == '.') {
            sep = i;
            break;
        } else if (c == '/' || c == '\\') {
            break;
        }
    }
    return sep;
}