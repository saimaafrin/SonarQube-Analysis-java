private void enlarge(final int size){
if(size <= 0){  
        throw new IllegalArgumentException("Size must be greater than 0");  
    }  
    int newSize = data.length + size;  
    Object[] newData = new Object[newSize];  
    System.arraycopy(data, 0, newData, 0, data.length);  
    data = newData;  
}  

**Explanation**:
The method `enlarge` is designed to increase the size of the internal array `data` by a specified amount. It first checks if the provided `size` is greater than zero, throwing an `IllegalArgumentException` if not. It then calculates the new size by adding the `size` to the current length of `data`. A new array `newData` of this new size is created. The `System.arraycopy` method is used to copy all elements from the original `data` array to the new `newData` array, starting from the beginning. Finally, the `data` reference is updated to point to the new larger array. This method ensures that the array can accommodate more elements without losing any existing data.