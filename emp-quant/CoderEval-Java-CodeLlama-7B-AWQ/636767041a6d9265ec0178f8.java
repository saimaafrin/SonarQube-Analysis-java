class Generated {
    private static String[] copyStrings(final String[] src){
    String[] dest = new String[src.length];
        for(int i = 0; i < src.length; i++){
            dest[i] = src[i].toLowerCase();
        }
        return dest;
    }
}
