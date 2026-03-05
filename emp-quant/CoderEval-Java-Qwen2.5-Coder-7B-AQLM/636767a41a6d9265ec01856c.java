class Generated {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
    if(str==null){  
            throw new NullPointerException("str");  
        }  
        if(index<0||index>str.length()){  
            throw new IndexOutOfBoundsException("index "+index);  
        }  
        if(len<0||len>str.length()-index){  
            throw new IndexOutOfBoundsException("len "+len);  
        }  
        int size=0;  
        for(int i=index;i<index+len;i++){  
            char c=str.charAt(i);  
            if(c<=0x7F){  
                size++;  
            }else if(c<=0x7FF){  
                size+=2;  
            }else if(c<=0xFFFF){  
                size+=3;  
            }else{  
                size+=4;  
            }  
        }  
        return size;  
    }  
    ```
}
