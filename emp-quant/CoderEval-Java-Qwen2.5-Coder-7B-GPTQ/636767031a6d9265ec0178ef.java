class Generated {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
    if(array==null){  
            throw new IllegalArgumentException("Cannot grow null array");  
        }  
        int length=array instanceof long[]?(long[])array.length:(int[])array.length;  
        Object newArray=Array.newInstance(newArrayComponentType,length+1);  
        System.arraycopy(array,0,newArray,0,length);  
        return newArray;  
    }  
    
    **Explanation:**
    The function `copyArrayGrow1` takes two parameters: an array (`array`) and a class type (`newArrayComponentType`). It first checks if the input array is null and throws an exception if it is. Then, it determines the length of the input array based on its type (either `long[]` or `int[]`). A new array of the same component type as the input array but with one additional element is created using `Array.newInstance`. The existing elements from the input array are copied to the new array using `System.arraycopy`, and then the new array is returned.
    
    This function is useful when you need to dynamically increase the size of an array by adding a single element while preserving the existing elements.
}
