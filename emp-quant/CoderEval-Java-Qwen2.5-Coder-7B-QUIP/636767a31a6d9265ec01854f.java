private void checkIfPackedField() throws IOException {
if (packed) { 
        packed = false; 
        long value = readLong(); 
        if (value < 0) { 
            throw new IOException("Invalid packed field value: " + value); 
        } 
        packedField = value; 
    } 
}