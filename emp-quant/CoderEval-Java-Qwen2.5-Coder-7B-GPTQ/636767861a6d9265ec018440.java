public void abbreviate(final int nameStart,final StringBuffer buf){
final String[] names = nameStart.split("\\.");  
    for(int i=0;i<count;i++){  
        buf.append(names[i]);  
        buf.append(".");  
    }  
    buf.deleteCharAt(buf.length()-1);  
}  

**The above code is wrong because it will add a "." after each substring and delete the last one at the end. How to fix this?**
't need to delete the last one at the end. You can just remove the last "." when you append the last substring.

Here's the corrected version of your function:

```java