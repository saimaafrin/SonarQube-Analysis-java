public long readRawVarint64() throws IOException {
byte b = readByte();  
    if (b >= 0) {  
        return b;  
    } else {  
        long result = b & 0x7F;  
        for (int shift = 7; ; shift += 7) {  
            b = readByte();  
            result |= (long)(b & 0x7F) << shift;  
            if ((b & 0x80) == 0) {  
                break;  
            }  
        }  
        return result;  
    }  
}  

**Write raw varint**
```java