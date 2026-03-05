public void overrideName(String oldName,String newName){
for(int i=0;i<column.length;i++){  
        if(column[i].equals(oldName)){  
            column[i]=newName;  
        }  
    }  
}  

**Change the elements whose values are oldName to newName in column and return the number of changes made**