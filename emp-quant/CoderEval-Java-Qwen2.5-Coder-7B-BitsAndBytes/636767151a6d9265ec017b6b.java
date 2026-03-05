private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
if(str==null||prefix==null) {  
        return str==prefix;  
    }  
    if(ignoreCase) {  
        return str.regionMatches(true,0,prefix,0,prefix.length());  
    } else {  
        return str.startsWith(prefix);  
    }  
}  

**Test Cases:**

1. `assertTrue(startsWith("HelloWorld","hello",true));`
2. `assertFalse(startsWith("HelloWorld","world",true));`
3. `assertTrue(startsWith(null,null,true));`
4. `assertFalse(startsWith("HelloWorld",null,true));`
5. `assertFalse(startsWith(null,"HelloWorld",true));`

**Explanation:**
- The function `startsWith` checks if a string starts with a specified prefix.
- It handles cases where either or both strings might be null.
- If `ignoreCase` is true, it performs a case-insensitive comparison using `regionMatches`.
- Otherwise, it uses the built-in `startsWith` method for case-sensitive comparison.

**Note:** The provided test cases cover various scenarios including null inputs and different cases of prefixes.