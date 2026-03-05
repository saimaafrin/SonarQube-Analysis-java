protected Label readLabel(final int bytecodeOffset,final Label[] labels){
// If there is no label at this bytecode offset, create one.
    if(labels[bytecodeOffset] == null){
        labels[bytecodeOffset] = new Label();
    }
    // Return the label at this bytecode offset.
    return labels[bytecodeOffset];
}