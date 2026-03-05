class Generated {
    public void removeAppender(String name){
    synchronized(appenderList){
            for(int i=0;i<appenderList.size();i++){
                if(((LoggerAppender)appenderList.get(i)).getName().equals(name)){
                    appenderList.remove(i);
                    break;
                }
            }
        }
    }
}
