private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
if(array == null){  
        throw new NullPointerException();  
    }  
    int length = Array.getLength(array);  
    Object newArray = Array.newInstance(newArrayComponentType,length + 1);  
    System.arraycopy(array,0,newArray,0,length);  
    return newArray;  
}  

**Explanation:**
The function `copyArrayGrow1` is designed to create a copy of the given array and add a default value at the end. Here's a step-by-step explanation of how it works:

1. **Null Check**: The function first checks if the input array is `null`. If it is, it throws a `NullPointerException` because it's not possible to operate on a `null` array.

2. **Get Length**: It retrieves the length of the input array using `Array.getLength(array)`.

3. **Create New Array**: It creates a new array of the same component type as the input array but with one additional element. This is done using `Array.newInstance(newArrayComponentType, length + 1)`.

4. **Copy Elements**: It copies all elements from the original array to the new array using `System.arraycopy(array, 0, newArray, 0, length)`. This method efficiently copies elements from the source array to the destination array.

5. **Return New Array**: Finally, it returns the new array, which now contains all elements from the original array plus an additional default value at the end.

This function is useful when you need to add an element to an array and ensure that the original array remains unchanged.