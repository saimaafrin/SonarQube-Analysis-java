public final MatchResult match(CharSequence uri){
if (uri == null) {
        throw new NullPointerException("uri");
    }
    if (pattern == null) {
        throw new NullPointerException("pattern");
    }
    Matcher matcher = pattern.matcher(uri);
    if (matcher.matches()) {
        return matcher.toMatchResult();
    }
    return null;
}