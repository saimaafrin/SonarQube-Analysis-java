private void enlarge(final int size){
byte[] new_data = new byte[data.length + size]; 
    for(int i = 0; i < data.length; i++){ 
        new_data[i] = data[i]; 
    } 
    data = new_data; 
} 

**Explanation**:
The `enlarge` method is designed to increase the size of the `data` array by the specified `size`. Here's a breakdown of how it works:

1. **New Array Creation**: A new byte array `new_data` is created with a length equal to the current length of `data` plus the `size`. This new array will hold the enlarged data.

2. **Copying Existing Data**: The existing data in the `data` array is copied to the new `new_data` array. This is done using a simple for loop that iterates through the existing data and assigns each element to the corresponding position in the new array.

3. **Updating the Data**: After the new data is copied, the `data` array is updated to reference the new `new_data` array. This ensures that the original `data` array now represents the enlarged data.

This method effectively increases the capacity of the `data` array by the specified `size`, allowing for more data to be stored.