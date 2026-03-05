public static int nullSafeHashCode(long[] array){
if(array == null) return 0;  
    int result = 1;  
    for(int i=0;i<array.length;i++){  
        long element = array[i];  
        result = 31 * result + (int)(element ^ (element >>> 32));  
    }  
    return result;  
}  

**Explanation:**
- The function `nullSafeHashCode` is designed to compute a hash code for an array of `long` values.
- If the input array is `null`, it returns `0`.
- It initializes a variable `result` to `1`. This is a common practice in hash code computation to avoid returning `0` for non-null arrays.
- It iterates over each element in the array using a for loop.
- For each element, it performs a bitwise XOR operation with its right-shifted version by 32 bits. This helps in handling both positive and negative numbers uniformly.
- It then multiplies the current `result` by `31` and adds the computed hash value of the element. The multiplier `31` is chosen because it is a prime number and helps in distributing the hash codes more evenly across the possible integer range.
- Finally, it returns the accumulated `result` as the hash code of the array.

This method ensures that the hash code is consistent and well-distributed even for large arrays or arrays containing very large or small `long` values.