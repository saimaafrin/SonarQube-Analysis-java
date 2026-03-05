class Generated {
    public void abbreviate(final int nameStart,final StringBuffer buf){
    final int count=buf.length();
    	final int nameEnd=nameStart+count;
    	int i=nameStart;
    	while(i<nameEnd){
    		final int j=buf.indexOf(".",i);
    		if(j<0||j>=nameEnd){
    			break;
    		}
    		buf.delete(i,j);
    		i=j;
    	}
    }
}
