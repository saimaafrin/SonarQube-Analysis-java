public static int computeUTF8Size(final CharSequence str,final int index,final int len){
if(str==null||index<0||len<=0||index+len>str.length()){  
        throw new IllegalArgumentException("Invalid arguments");  
    }  
    int size=0;  
    for(int i=index;i<index+len;i++){  
        char c=str.charAt(i);  
        if(c>=0&&c<=127){  
            size+=1;  
        }else if(c>=194&&c<=223){  
            size+=2;  
        }else if(c>=224&&c<=239){  
            size+=3;  
        }else if(c>=240&&c<=247){  
            size+=4;  
        }else{  
            //Invalid UTF-8 character  
            return -1;  
        }  
    }  
    return size;  
}