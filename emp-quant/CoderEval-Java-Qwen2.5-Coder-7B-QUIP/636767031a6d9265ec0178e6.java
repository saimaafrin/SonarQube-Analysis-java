public static byte[] toPrimitive(final Byte[] array){
if(array == null) return null;  
    byte[] result = new byte[array.length];  
    for(int i=0; i<array.length; i++){  
        result[i] = array[i];  
    }  
    return result;  
}  

**Convert an array of object Bytes to primitives, return null for a null input array.**
```java