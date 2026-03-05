private void checkIfPackedField() throws IOException {
// Check if the current field is packed
    if (currentField.isPacked()) {
        // Read the packed field from the input stream
        int packedValue = inputStream.readInt();
        // Update the internal state with the unpacked value
        currentField.setValue(unpack(packedValue));
    }
}