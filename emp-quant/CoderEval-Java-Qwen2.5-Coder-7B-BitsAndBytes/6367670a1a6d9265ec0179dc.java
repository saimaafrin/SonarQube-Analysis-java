class Generated {
    private void putAbstractTypes(final int start,final int end){
    for(int i=start;i<=end;i++){
            final AbstractType<?> abstractType = currentFrame.get(i);
            if(abstractType != null){
                frame.add(abstractType);
            }
        }
    }
}
