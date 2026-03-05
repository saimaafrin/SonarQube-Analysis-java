class Generated {
    public void abbreviate(final int nameStart,final StringBuffer buf){
    if(nameStart==0){
            return;
        }
        int count=0;
        int i=nameStart;
        while(i<buf.length()&&buf.charAt(i)!='.'){
            i++;
            count++;
        }
        if(i<buf.length()){
            buf.delete(nameStart,i);
        }
        if(count>1){
            buf.append("...");
        }
    }
}
