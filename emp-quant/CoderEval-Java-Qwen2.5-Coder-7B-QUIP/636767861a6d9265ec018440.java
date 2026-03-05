public void abbreviate(final int nameStart,final StringBuffer buf){
int i=0;  
    for(i=0;i<nameStart;i++){  
        buf.append(this.names[i]);  
    }  
    buf.append("...");  
    for(i=nameStart;i<this.names.length;i++){  
        buf.append(this.names[i]);  
    }  
}  
**The given name can be split into several substrings by ".",and abbreviate the name in the buf by deleting the first count substrings. **