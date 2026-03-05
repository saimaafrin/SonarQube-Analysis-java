class Generated {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
    // If there is already a label at this bytecode offset, return it.
        if(labels[bytecodeOffset] != null){
            return labels[bytecodeOffset];
        } else {
            // Create a new label for this bytecode offset.
            final Label label = new Label(bytecodeOffset);
            labels[bytecodeOffset] = label;
            return label;
        }
    }
}
