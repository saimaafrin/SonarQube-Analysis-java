private void putAbstractTypes(final int start,final int end){
for(int i=start;i<=end;i++){
		final AbstractType type=getAbstractType(i);
		if(type!=null){
			type.setFrame(currentFrame);
		}
	}
}