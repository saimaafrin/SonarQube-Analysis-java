class Generated {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
    if(array==null)
    		return;
    	buffer.append(fieldName);
    	buffer.append(": ");
    	for(int i=0;i<array.length;i++){
    		buffer.append(array[i]);
    		buffer.append(",");
    	}
    	buffer.append("\n");
    }
}
