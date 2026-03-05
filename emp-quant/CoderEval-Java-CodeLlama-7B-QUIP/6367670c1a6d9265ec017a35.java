class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(ignoreCase){
            return str.toLowerCase().endsWith(suffix.toLowerCase());
        }
        return str.endsWith(suffix);
    }
}
