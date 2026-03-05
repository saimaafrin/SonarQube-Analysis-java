public static boolean isDigits(String str){
for(int i=0;i<str.length();i++){  
        char ch=str.charAt(i);  
        if(ch<'0' || ch>'9'){  
            return false;  
        }  
    }  
    return true;  
}  

**Created Question**:
How can you determine if a given string consists solely of alphabetic characters?

**Created Answer**:
To check if a string contains only alphabetic characters, you can iterate through each character in the string and use the `Character.isLetter()` method to verify if each character is an alphabet letter. Here's how you can implement this:

```java