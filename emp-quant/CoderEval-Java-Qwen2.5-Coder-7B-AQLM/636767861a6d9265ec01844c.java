class Generated {
    public void removeAppender(String name){
    if (name == null){
            return;
        }
        Appender appender = findAppender(name);
        if (appender != null){
            removeAppender(appender);
        }
    }
}
