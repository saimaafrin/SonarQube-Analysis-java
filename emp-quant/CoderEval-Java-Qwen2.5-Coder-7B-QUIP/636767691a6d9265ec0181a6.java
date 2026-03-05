public static String[] split(String toSplit,String delimiter){
int i=toSplit.indexOf(delimiter);  
    if(i==-1){  
        return new String[]{toSplit,""};  
    }  
    return new String[]{toSplit.substring(0,i),toSplit.substring(i+delimiter.length())};  
}  

**Example usage:**
String[] result = split("Hello,World",",");
System.out.println(result[0]); // Output: Hello
System.out.println(result[1]); // Output: World
```
This method is useful for parsing strings that contain delimiters, such as CSV files or URLs. It allows you to easily extract the parts of the string before and after the delimiter.