private void checkIfPackedField() throws IOException {
if (isPackedField()) { 
        int packedField = readPackedField(); 
        updateInternalState(packedField); 
    } 
}