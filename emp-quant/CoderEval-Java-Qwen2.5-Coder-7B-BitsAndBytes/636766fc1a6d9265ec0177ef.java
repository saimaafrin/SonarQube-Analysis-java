static String[] toNoNullStringArray(Object[] array){
if(array.length==0)  
        throw new IllegalArgumentException("The length of array can't be 0");  
    int count=0;  
    for(int i=0;i<array.length;i++) {  
        if(array[i]!=null) {  
            count++;  
        }  
    }  
    String[] result=new String[count];  
    int j=0;  
    for(int i=0;i<array.length;i++) {  
        if(array[i]!=null) {  
            result[j]=(String)array[i];  
            j++;  
        }  
    }  
    return result;  
}