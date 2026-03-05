public long readLong(final int offset){
return ((long)read(offset)) & 0xFF | ((long)read(offset + 1)) << 8 | ((long)read(offset + 2)) << 16 | ((long)read(offset + 3)) << 24 | ((long)read(offset + 4)) << 32 | ((long)read(offset + 5)) << 40 | ((long)read(offset + 6)) << 48 | ((long)read(offset + 7)) << 56;  
}