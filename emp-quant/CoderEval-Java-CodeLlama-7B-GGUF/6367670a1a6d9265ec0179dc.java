private void putAbstractTypes(final int start,final int end){
for(int i=start;i<=end;i++){
		if(i<0||i>=currentFrame.size())
			throw new IndexOutOfBoundsException();
		Frame.add(currentFrame.get(i));
	}
}