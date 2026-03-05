class Generated {
    public void abbreviate(final int nameStart,final StringBuffer buf){
    int count = 0;
        int index = nameStart;
        while (index < buf.length() && count < 2) {
            if (buf.charAt(index) == '.') {
                count++;
            }
            index++;
        }
        buf.delete(nameStart, index);
    }
}
