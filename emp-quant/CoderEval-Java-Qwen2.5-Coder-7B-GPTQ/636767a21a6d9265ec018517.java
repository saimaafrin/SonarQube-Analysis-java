public final byte[] toByteArray(){
if (length == 0) {  
        return EMPTY_BYTE_ARRAY;  
    } else if (length <= capacity) {  
        // If the length of the data is less than or equal to the capacity,  
        // we can directly copy the data from the buffer.  
        byte[] result = new byte[length];  
        System.arraycopy(buffer, offset, result, 0, length);  
        return result;  
    } else {  
        // If the length of the data exceeds the capacity,  
        // we need to allocate a larger array and copy the data in chunks.  
        byte[] result = new byte[length];  
        int pos = 0;  
        while (pos < length) {  
            int chunkSize = Math.min(capacity - offset, length - pos);  
            System.arraycopy(buffer, offset, result, pos, chunkSize);  
            pos += chunkSize;  
            offset = 0;  
        }  
        return result;  
    }  
}