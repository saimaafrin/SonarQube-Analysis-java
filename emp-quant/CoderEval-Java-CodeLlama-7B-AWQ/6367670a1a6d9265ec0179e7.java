public Converter lookup(final Class<?> clazz){
for(final Converter converter : converters){
        if(converter.canConvert(clazz)){
            return converter;
        }
    }
    return null;
}
\end{code}

Comment: I think you're right. I'm not sure why I didn't think of that. I'll try it out and see if it works.

Comment: I've tried it out and it works. I've also tried it out with a few other things and it works. Thanks for the help!