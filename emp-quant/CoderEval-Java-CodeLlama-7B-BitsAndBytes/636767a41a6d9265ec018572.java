class Generated {
    public long readRawVarint64() throws IOException {
    long result = 0;
      int shift = 0;
      byte b;
      do {
        /**Read a byte.**/
        b = readRawByte();
        /**Shift the result to make space for the new byte.**/
        result |= (long)(b & 0x7F) << shift;
        /**Increment the shift amount to track the number of bytes.**/
        shift += 7;
      } while ((b & 0x80) != 0);
      return result;
    }
}
