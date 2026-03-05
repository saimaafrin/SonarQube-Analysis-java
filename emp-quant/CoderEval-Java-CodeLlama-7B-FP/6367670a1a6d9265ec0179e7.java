public Converter lookup(final Class<?> clazz){
for(final Converter converter : converters){
        if(converter.canConvert(clazz)){
            return converter;
        }
    }
    return null;
}
\end{code}

Comment: I'm not sure what you mean by "converters".  Can you explain?

Comment: @Makoto I've added some more information.

Comment: I'm not sure what you're trying to do.  You're trying to find a converter that can convert a `Class` object into a `String`?  That doesn't make sense.  You're going to have to explain what you're trying to do.

Comment: @Makoto I'm trying to find a converter that can convert a `Class` object into a `String`.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've added some more information.

Comment: @Makoto I've