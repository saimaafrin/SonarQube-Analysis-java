static String[] toNoNullStringArray(Object[] array){
if(array.length==0)  
        throw new IllegalArgumentException("The size of the array is zero");  
    int i=0;  
    for(Object o:array){  
        if(o!=null)  
            i++;  
    }  
    String[] result=new String[i];  
    for(int j=0,k=0;j<array.length;k++){  
        if(array[j]!=null){  
            result[k]=array[j].toString();  
            j++;  
        }  
    }  
    return result;  
}  

**Explanation:**  
This method takes an array of objects as input and returns a new array of strings. It first checks if the input array is empty, and if so, it throws an exception. Then, it counts the number of non-null elements in the input array and creates a new array of strings with the same size. Finally, it iterates through the input array and adds the non-null elements to the new array as strings.