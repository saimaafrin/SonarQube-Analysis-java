class Generated {
    public static boolean isAsciiControl(final char ch){
    return (ch >= 0x00 && ch <= 0x1F) || (ch >= 0x7F && ch <= 0x9F);
    }
}
