class Generated {
    public void abbreviate(final int nameStart,final StringBuffer buf){
    final String name=buf.substring(nameStart);  
        final int len=name.length();  
        if(len<=3){  
            buf.delete(nameStart,len);  
            buf.insert(nameStart,"...");  
            return;  
        }  
        final int count=len/4;  
        final int start=count*4;  
        buf.delete(nameStart,start);  
        buf.insert(nameStart,"...");  
        buf.insert(nameStart+3,name.substring(start));  
    }
}
