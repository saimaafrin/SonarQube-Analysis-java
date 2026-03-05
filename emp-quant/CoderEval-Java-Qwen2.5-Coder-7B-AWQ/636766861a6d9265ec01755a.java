public final MatchResult match(CharSequence uri){
if (uri == null) {
        throw new NullPointerException("URI is null");
    }
    Matcher matcher = this.pattern.matcher(uri);
    if (matcher.matches()) {
        return matcher.toMatchResult();
    } else {
        return null;
    }
}