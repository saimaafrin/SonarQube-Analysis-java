class Generated {
    @Override public void write(final byte b[],final int off,final int len) throws IOException {
    if(len == 0) return;
    	if(len == 1) {
    		writeByte(b[off]);
    		return;
    	}
    	if(len == 2) {
    		writeShort(b[off]);
    		return;
    	}
    	if(len == 4) {
    		writeInt(b[off]);
    		return;
    	}
    	if(len == 8) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 16) {
    		writeDouble(b[off]);
    		return;
    	}
    	if(len == 32) {
    		writeFloat(b[off]);
    		return;
    	}
    	if(len == 64) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 128) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 256) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 512) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 1024) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 2048) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 4096) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 8192) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 16384) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 32768) {
    		writeLong(b[off]);
    		return;
    	}
    	if(len == 65536) {
    		writeLong(b[off]);
    }}
}
