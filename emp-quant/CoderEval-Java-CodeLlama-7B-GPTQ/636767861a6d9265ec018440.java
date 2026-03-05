class Generated {
    public void abbreviate(final int nameStart,final StringBuffer buf){
    int count=0;
        int index=nameStart;
        while(index!=-1){
            index=buf.indexOf(".",index+1);
            count++;
        }
        if(count>0){
            buf.delete(nameStart,nameStart+count);
        }
    }
}
