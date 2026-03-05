class Generated {
    private void putAbstractTypes(final int start,final int end){
    for(int i=start;i<=end;i++){
    		if(i<0||i>=currentFrame.size())
    			throw new IndexOutOfBoundsException("Index "+i+" is out of bounds for currentFrame");
    		if(currentFrame.get(i) instanceof AbstractType)
    			frame.add((AbstractType)currentFrame.get(i));
    		else
    			throw new ClassCastException("Element at index "+i+" is not an AbstractType");
    	}
    }
}
