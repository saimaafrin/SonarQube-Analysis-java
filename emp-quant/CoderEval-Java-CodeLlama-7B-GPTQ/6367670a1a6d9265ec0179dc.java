class Generated {
    private void putAbstractTypes(final int start,final int end){
    for(int i=start;i<=end;i++){
    		if(i<0||i>=abstractTypes.size())
    			throw new IndexOutOfBoundsException();
    		frame.addAbstractType(abstractTypes.get(i));
    	}
    }
}
