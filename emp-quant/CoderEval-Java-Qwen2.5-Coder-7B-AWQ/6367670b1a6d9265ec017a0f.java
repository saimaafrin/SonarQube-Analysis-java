public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
for (String s : searchStrArray) {  
        if (str.toLowerCase().contains(s.toLowerCase())) {  
            return true;  
        }  
    }  
    return false;  
}  

**Explanation:**
- The function `containsAnyIgnoreCase` takes two parameters: a string `str` and a list of strings `searchStrArray`.
- It iterates over each element in the `searchStrArray`.
- For each element, it checks if the lowercase version of `str` contains the lowercase version of the current element.
- If any such condition is met, the function returns `true`.
- If none of the conditions are met after checking all elements, the function returns `false`.

This function is useful when you need to check if a string contains any of several substrings, ignoring case sensitivity.