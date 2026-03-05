class Generated {
    public void abbreviate(final int nameStart,final StringBuffer buf){
    int count=0;  
        int i=nameStart;  
        while(i<buf.length()&&buf.charAt(i)!='.'){  
            if(buf.charAt(i)!=' '){  
                count++;  
            }  
            i++;  
        }  
        if(count>0){  
            buf.insert(nameStart,count);  
            buf.delete(nameStart+count,nameStart+count+1);  
        }  
    }
}
