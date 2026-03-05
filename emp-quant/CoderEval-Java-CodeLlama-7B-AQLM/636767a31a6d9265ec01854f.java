private void checkIfPackedField() throws IOException {
if (packedFieldNumber == fieldNumber) {
        if (packedFieldWireType == WireType.VARINT) {
            packedFieldLong = readVarint();
        } else if (packedFieldWireType == WireType.FIXED_64) {
            packedFieldLong = readRawLittleEndian64();
        } else if (packedFieldWireType == WireType.FIXED_32) {
            packedFieldLong = readRawLittleEndian32();
        } else {
            throw new RuntimeException("Shouldn't get here.");
        }
        packedFieldNumber = -1;
        packedFieldWireType = WireType.VARINT;
    }
}