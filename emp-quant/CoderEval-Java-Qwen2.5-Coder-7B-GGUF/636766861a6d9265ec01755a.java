class Generated {
    public final MatchResult match(CharSequence uri){
    if (uri == null) {
            throw new NullPointerException("uri is null");
        }
        if (pattern == null) {
            throw new NullPointerException("pattern is null");
        }
        Matcher matcher = pattern.matcher(uri);
        if (matcher.matches()) {
            return new MatchResult(matcher);
        } else {
            return null;
        }
    }
}
