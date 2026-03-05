class Generated {
    @Override public void write(final byte b[],final int off,final int len) throws IOException {
    if (b==null) throw new NullPointerException();
    	if (off<0 || len<0 || len>b.length-off) throw new IndexOutOfBoundsException();
    	if (len==0) return;
    	if (len>buf.length-pos) {
    		flushBuffer();
    		if (len>buf.length) {
    			byte[] b2=new byte[len];
    			System.arraycopy(b,off,b2,0,len);
    			out.write(b2);
    			return;
    		}
    	}
    	System.arraycopy(b,off,buf,pos,len);
    	pos+=len;
    }
}
