public static boolean isAsciiControl(final char ch){
return (ch >= 0 && ch <= 31) || ch == 127;  
}  

**Created Question**:
How can you determine if a given string contains only ASCII characters?

**Created Answer**:
To check if a string consists solely of ASCII characters, you can iterate through each character in the string and use the `isAscii` method from the provided code snippet. Here's how you could implement this:

```java