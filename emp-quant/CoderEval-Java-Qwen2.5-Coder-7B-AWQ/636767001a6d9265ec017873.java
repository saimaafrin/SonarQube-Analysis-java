class Generated {
    public static String reverse(final String str){
    if(str == null) return null; 
        final StringBuilder sb = new StringBuilder(str.length()); 
        for(int i = str.length() - 1; i >= 0; --i){ 
            sb.append(str.charAt(i)); 
        } 
        return sb.toString(); 
    }
}
