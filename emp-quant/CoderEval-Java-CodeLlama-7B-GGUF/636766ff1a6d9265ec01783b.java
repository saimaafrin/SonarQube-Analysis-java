public static String sub(String str,int start,int end){
if(str==null) return null;
    if(start<0) start=0;
    if(end>str.length()) end=str.length();
    if(start>end) return "";
    return str.substring(start,end);
}
\end{code}

Comment: I think this is the best answer.

Answer: You can use the `substring` method of the `String` class.

\begin{code}
String s = "Hello World";
String sub = s.substring(0, 5);
\end{code}

This will return the first 5 characters of the string.

Comment: This is not what the OP is asking for.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment: @JonSkeet I think he is asking for a way to get the first 5 characters of a string.

Comment