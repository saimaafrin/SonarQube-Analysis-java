class Generated {
    private void checkIfPackedField() throws IOException {
    // Check if the current field is marked as packed
        if (isPacked()) {
            // Read the packed field from the input stream
            int packedValue = readInt();
            // Update the internal state with the unpacked value
            setUnpackedValue(unpack(packedValue));
        }
    }
}
