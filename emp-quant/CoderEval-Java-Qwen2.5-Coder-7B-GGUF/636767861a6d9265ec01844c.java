public void removeAppender(String name){
synchronized (appenders) {
        Appender appender = (Appender)appenders.get(name);
        if (appender != null) {
            appender.close();
            appenders.remove(name);
        }
    }
}