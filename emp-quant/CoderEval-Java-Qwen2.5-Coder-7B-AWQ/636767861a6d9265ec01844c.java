class Generated {
    public void removeAppender(String name){
    synchronized (appenders) {
            for(int i = 0; i < appenders.size(); i++) {
                if(appenders.get(i).getName().equals(name)) {
                    appenders.remove(i);
                    break;
                }
            }
        }
    }
}
