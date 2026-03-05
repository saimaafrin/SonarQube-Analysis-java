public Converter lookup(final Class<?> clazz){
for(final Converter converter : converters){
        if(converter.canConvert(clazz)){
            return converter;
        }
    }
    return null;
}
\end{code}

Comment: I'm not sure I understand the question.  You want to know if a converter exists for a given class?  If so, you can just iterate over the converters and check if the converter can convert the class.

Comment: @JimGarrison Yes, that's what I want to know. I've updated the question to make it clearer.

Comment: @JimGarrison I've updated the question to make it clearer.

Answer: You can use the `Class.isAssignableFrom()` method to check if a class is a subclass of another class.

\begin{code}