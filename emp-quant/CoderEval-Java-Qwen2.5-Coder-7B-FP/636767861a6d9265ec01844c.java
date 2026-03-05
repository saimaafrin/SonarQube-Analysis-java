class Generated {
    public void removeAppender(String name){
    if (name == null) {
            return;
        }
        synchronized(appenderList){
            for(int i=0; i<appenderList.size(); i++){
                Appender a = (Appender)appenderList.get(i);
                if(a.getName().equals(name)){
                    appenderList.remove(i);
                    break;
                }
            }
        }
    }
}
