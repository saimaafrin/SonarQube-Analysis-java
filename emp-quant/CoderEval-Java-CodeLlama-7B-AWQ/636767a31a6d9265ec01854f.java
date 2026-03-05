class Generated {
    private void checkIfPackedField() throws IOException {
    if (this.packedFieldNumber == this.fieldNumber) {
            this.packedFieldNumber = -1;
            this.packedFieldWireType = 0;
            this.packedFieldSize = 0;
            this.packedFieldBuffer = null;
            this.packedFieldBufferOffset = 0;
            this.packedFieldBufferLength = 0;
            this.packedFieldEndOffset = 0;
            this.packedField = false;
        }
    }
}
