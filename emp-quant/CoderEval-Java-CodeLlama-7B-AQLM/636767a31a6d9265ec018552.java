class Generated {
    @Override public String readString() throws IOException {
    int len = readInt();
    	if (len < 0) {
    		return null;
    	}
    	StringBuilder sb = new StringBuilder(len);
    	for (int i = 0; i < len; i++) {
    		sb.append((char) readInt());
    	}
    	return sb.toString();
    }
}
