public Converter lookup(final Class<?> clazz){
for(Converter c : converters){
        if(c.canConvert(clazz)){
            return c;
        }
    }
    return null;
}