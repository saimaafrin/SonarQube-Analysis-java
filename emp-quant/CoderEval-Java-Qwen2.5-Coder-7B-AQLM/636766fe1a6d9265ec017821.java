protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
buffer.append(fieldName).append("=").append(array.length).append("[");  
    for(int i=0;i<array.length;i++){  
        buffer.append(array[i]);  
        if(i<array.length-1){  
            buffer.append(",");  
        }  
    }  
    buffer.append("]");  
}  

**Append a string to a buffer.**