private void checkIfPackedField() throws IOException {
if (packedFieldNumber == fieldNumber) {
        if (packedFieldLimit == 0) {
            int length = input.readRawVarint32();
            if ((length & 7) != 0 || length < 0) {
                throw InvalidProtocolBufferException.invalidVarint();
            }
            packedFieldLimit = length;
        }
        if (packedFieldLimit > 0) {
            --packedFieldLimit;
            return;
        }
        packedFieldNumber = 0;
    }
    if (packedFieldNumber != 0) {
        throw InvalidProtocolBufferException.truncatedMessage();
    }
    int tag = input.readTag();
    if (tag == 0) {
        return;
    }
    if ((tag & 7) == 2) {
        packedFieldNumber = WireFormat.getTagFieldNumber(tag);
        return;
    }
    if (packedFieldNumber != 0) {
        throw InvalidProtocolBufferException.truncatedMessage();
    }
    if (WireFormat.getTagWireType(tag) == WireFormat.WIRETYPE_END_GROUP) {
        return;
    }
    skipField(tag);
}