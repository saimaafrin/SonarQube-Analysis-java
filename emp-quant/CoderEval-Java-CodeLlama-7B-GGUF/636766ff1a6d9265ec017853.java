class Generated {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
    if(labels[bytecodeOffset]==null){
    		labels[bytecodeOffset]=new Label();
    	}
    	return labels[bytecodeOffset];
    }
}
