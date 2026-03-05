protected Label readLabel(final int bytecodeOffset,final Label[] labels){
for(int i=0;i<labels.length;i++){
		if(labels[i].bytecodeOffset==bytecodeOffset){
			return labels[i];
		}
	}
	Label label=new Label();
	label.bytecodeOffset=bytecodeOffset;
	labels[labels.length]=label;
	return label;
}