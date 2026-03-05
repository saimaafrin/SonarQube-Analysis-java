class Generated {
    private static String[] copyStrings(final String[] src){
    final int n = src.length;
        final String[] dest = new String[n];
        for(int i=0;i<n;i++){
            dest[i] = src[i];
        }
        return dest;
    }
}
