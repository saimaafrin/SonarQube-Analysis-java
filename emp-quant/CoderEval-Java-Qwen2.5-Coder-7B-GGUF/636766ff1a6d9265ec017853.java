protected Label readLabel(final int bytecodeOffset,final Label[] labels){
Label label=labels[bytecodeOffset]; 
    if(label==null){ 
        label=new Label(bytecodeOffset); 
        labels[bytecodeOffset]=label; 
    } 
    return label; 
}