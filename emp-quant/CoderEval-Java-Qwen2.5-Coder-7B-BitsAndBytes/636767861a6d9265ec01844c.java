public void removeAppender(String name){
if (name == null) {
        return;
    }
    synchronized (appenders) {
        for (int i = 0; i < appenders.size(); i++) {
            Appender appender = appenders.get(i);
            if (appender.getName().equals(name)) {
                appenders.remove(i);
                break;
            }
        }
    }
}