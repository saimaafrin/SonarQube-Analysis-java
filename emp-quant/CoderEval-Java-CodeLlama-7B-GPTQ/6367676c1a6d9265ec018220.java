public static String stripFilenameExtension(String path){
int lastDot = path.lastIndexOf('.');
    if(lastDot == -1){
        return path;
    }
    return path.substring(0, lastDot);
}
\end{code}

Comment: I think you mean `path.substring(0, lastDot);`

Comment: @JonSkeet: Yes, you are right. I've corrected it.

Answer: \begin{code}
String filename = "C:\\Users\\user\\Desktop\\test.txt";
String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf("."));
\end{code}

Answer: \begin{code}
String filename = "C:\\Users\\user\\Desktop\\test.txt";
String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf("."));
\end{code}

Answer: \begin{code}
String filename = "C:\\Users\\user\\Desktop\\test.txt";
String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf("."));
\end{code}

Answer: \begin{code}
String filename = "C:\\Users\\user\\Desktop\\test.txt";
String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf("."));
\end{code}

Answer: \begin{code}
String filename = "C:\\Users\\user\\Desktop\\test.txt";
String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf("."));
\end{code}