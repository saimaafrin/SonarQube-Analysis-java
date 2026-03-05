private int parseEndOfLine(String headerPart,int end){
while(end<headerPart.length()&&headerPart.charAt(end)!='\n'){  
        end++;  
    }  
    return end;  
}  

**Given a string representing an HTTP request, extract the headers and body parts.**
```java