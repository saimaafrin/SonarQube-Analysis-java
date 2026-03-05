public final MatchResult match(CharSequence uri){
if (uri == null) {
        throw new NullPointerException("URI is null");
    }
    Matcher matcher = pattern.matcher(uri);
    if (matcher.matches()) {
        return new MatchResult(matcher.group());
    } else {
        return null;
    }
}