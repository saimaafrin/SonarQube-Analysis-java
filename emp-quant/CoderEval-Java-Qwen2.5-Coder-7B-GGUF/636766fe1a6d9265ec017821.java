class Generated {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
    buffer.append(fieldName).append("=");  
        if(array==null){  
            buffer.append("null");  
        }else{  
            buffer.append("[");  
            for(int i=0;i<array.length;i++){  
                buffer.append(array[i]);  
                if(i<array.length-1){  
                    buffer.append(",");  
                }  
            }  
            buffer.append("]");  
        }  
        buffer.append("\n");  
    }  
    
    **Append a string to a buffer.**
}
