private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
final int length = Array.getLength(array);  
    final Object newArray = Array.newInstance(newArrayComponentType,length + 1);  
    System.arraycopy(array,0,newArray,0,length);  
    Array.set(newArray,length,newArrayComponentType.cast(0));  
    return newArray;  
}  

**Explanation**:
The function `copyArrayGrow1` is designed to copy an existing array and append a default value at the end. Here's a breakdown of how it works:

1. **Determine the Length of the Original Array**: The function starts by determining the length of the original array using `Array.getLength(array)`.

2. **Create a New Array**: A new array is created using `Array.newInstance(newArrayComponentType, length + 1)`. This new array has the same component type as the original array but is one element longer.

3. **Copy Elements from the Original Array to the New Array**: The function uses `System.arraycopy(array, 0, newArray, 0, length)` to copy all elements from the original array to the new array.

4. **Set the Default Value**: The function sets the default value at the end of the new array using `Array.set(newArray, length, newArrayComponentType.cast(0))`. The default value is cast to the component type of the array.

5. **Return the New Array**: Finally, the function returns the new array with the default value appended.

This function is useful when you need to add an element to an array and ensure that the array is properly resized and the new element is initialized with a default value.