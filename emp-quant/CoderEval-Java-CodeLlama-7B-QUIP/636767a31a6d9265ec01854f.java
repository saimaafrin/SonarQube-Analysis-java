class Generated {
    private void checkIfPackedField() throws IOException {
    if (packedFields.contains(fieldNumber)) {
            if (packedFieldNumber == fieldNumber) {
                return;
            }
            if (packedFieldNumber != -1) {
                throw new IOException("Multiple packed fields not allowed");
            }
            packedFieldNumber = fieldNumber;
            packedFieldValue = fieldValue;
        }
    }
}
