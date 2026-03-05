class Generated {
    public void overrideName(String oldName,String newName){
    for(int i=0;i<column.length;i++){  
            if(column[i].equals(oldName)){  
                column[i]=newName;  
            }  
        }  
    }  
    
    **Explanation:**
    The function `overrideName` takes two parameters, `oldName` and `newName`. It iterates through each element of the array `column`. If an element matches `oldName`, it replaces that element with `newName`. This effectively changes all occurrences of `oldName` to `newName` in the array.
}
