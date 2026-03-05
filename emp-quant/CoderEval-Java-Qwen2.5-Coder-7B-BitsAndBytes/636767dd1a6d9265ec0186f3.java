public void overrideName(String oldName,String newName){
for(int i=0;i<column.length;i++){  
        if(column[i].equals(oldName)){  
            column[i]=newName;  
        }  
    }  
}  

**Explanation:**
The function `overrideName` is designed to replace all occurrences of a specified string (`oldName`) with another string (`newName`) within an array named `column`. Here's how it works:

1. **Loop Through Array**: The function uses a `for` loop to iterate through each element in the `column` array.
2. **Check and Replace**: Inside the loop, there is an `if` statement that checks if the current element (`column[i]`) is equal to `oldName`.
3. **Replace Element**: If the condition is true, the element is replaced with `newName`.

This function effectively updates the entire array by replacing all instances of `oldName` with `newName`, ensuring that no old names remain in the array after the operation.