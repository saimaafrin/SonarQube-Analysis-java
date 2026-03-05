public final MatchResult match(CharSequence uri){
if(uri == null){
        throw new NullPointerException("uri is null");
    }
    // If the pattern is not compiled yet, compile it.
    if(pattern == null){
        synchronized(this){
            if(pattern == null){
                try{
                    pattern = Pattern.compile(regex);
                }catch(MalformedPatternException e){
                    throw new IllegalArgumentException("Invalid regex: " + regex, e);
                }
            }
        }
    }

    // Attempt to match the URI against the compiled pattern.
    Matcher matcher = pattern.matcher(uri);
    if(matcher.matches()){
        return new MatchResultImpl(matcher.group());
    } else {
        return null;
    }
}