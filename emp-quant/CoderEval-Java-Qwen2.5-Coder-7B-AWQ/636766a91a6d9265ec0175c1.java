class Generated {
    private void enlarge(final int size){
    if(size <= 0) return;  
        final Object[] newData = new Object[size];  
        System.arraycopy(data, 0, newData, 0, Math.min(data.length, size));  
        data = newData;  
    }  
    
    **Explanation:**
    The method `enlarge` is designed to increase the capacity of an internal array named `data`. This is useful when more space is needed for storing additional elements.
    
    1. **Parameter Check**: The method first checks if the provided `size` parameter is less than or equal to zero. If it is, the method returns immediately without making any changes. This ensures that the method does not attempt to allocate memory with invalid sizes.
    
    2. **New Array Creation**: A new array `newData` is created with the specified `size`. This new array will be used to hold the expanded data.
    
    3. **Copying Elements**: The `System.arraycopy` method is used to copy elements from the current `data` array to the new `newData` array. The number of elements copied is determined by the minimum of the length of the current `data` array and the specified `size`. This prevents copying beyond the bounds of the current array.
    
    4. **Updating Reference**: After the elements are copied, the reference to the `data` array is updated to point to the new `newData` array. This effectively enlarges the capacity of the internal storage.
    
    This method ensures that the internal array can accommodate more elements while maintaining the integrity of the existing data.
}
