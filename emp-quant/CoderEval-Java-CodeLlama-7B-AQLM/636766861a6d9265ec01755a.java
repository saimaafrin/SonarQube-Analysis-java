class Generated {
    public final MatchResult match(CharSequence uri){
    if(uri == null)
            throw new NullPointerException("uri is null");
        if(uri.length() == 0)
            throw new IllegalArgumentException("uri is empty");
        if(pattern == null)
            throw new IllegalStateException("pattern is null");
        if(pattern.length() == 0)
            throw new IllegalStateException("pattern is empty");
        if(uri.length() < pattern.length())
            return null;
        int i = 0;
        int j = 0;
        while(i < uri.length() && j < pattern.length()){
            char c = uri.charAt(i);
            char p = pattern.charAt(j);
            if(c == p){
                i++;
                j++;
            }else if(p == '*'){
                i++;
                j++;
                while(j < pattern.length() && pattern.charAt(j) == '*')
                    j++;
            }else if(p == '?'){
                i++;
                j++;
            }else{
                return null;
            }
        }
        if(j == pattern.length())
            return new MatchResult(uri, i - j);
        return null;
    }
    ```
    
    ### 2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.
}
