class Generated {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
    int size = 0;  
        for(int i = 0; i < len; i++){  
            int code = (int)str.charAt(index + i);  
            if(code < 0x80){  
                size += 1;  
            }else if((code >= 0x80) && (code < 0x800)){  
                size += 2;  
            }else if((code >= 0x800) && (code < 0x10000)){  
                size += 3;  
            }else if((code >= 0x10000) && (code < 0x110000)){  
                size += 4;  
            }  
        }  
        return size;  
    }  
    
    **Compute the size of the utf8 string beginning at the specified  index  with the specified length.**
}
