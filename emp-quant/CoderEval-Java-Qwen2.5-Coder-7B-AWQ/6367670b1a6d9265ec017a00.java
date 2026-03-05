public static boolean isSameLength(final byte[] array1,final byte[] array2){
if(array1 == null && array2 == null){
        return true;
    }else if(array1 != null && array2 != null){
        return array1.length == array2.length;
    }
    return false;  
}  

**Created Question**:
How can you determine if a given integer value falls within a specified range?

**Created Answer**:
To check if an integer value is within a certain range, you can use the following method:

```java