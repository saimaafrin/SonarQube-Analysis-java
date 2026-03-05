public static int countOccurrencesOf(String str,String sub){
if(str==null||sub==null) return 0;  
    int count=0;  
    int index=str.indexOf(sub);  
    while(index!=-1){  
        count++;  
        index=str.indexOf(sub,index+1);  
    }  
    return count;  
}  

**Explanation:**
- The function `countOccurrencesOf` takes two parameters, a string `str` and a substring `sub`.
- It first checks if either of the strings is null. If so, it returns 0 because there can't be any occurrences.
- It initializes a counter `count` to zero and uses the `indexOf` method to find the first occurrence of the substring in the string.
- A while loop is used to continue searching for the substring starting from the position right after the last found occurrence.
- Each time an occurrence is found, the counter is incremented, and the search continues.
- When no more occurrences are found (`index == -1`), the loop ends, and the total count of occurrences is returned.