public Converter lookup(final Class<?> clazz){
for(Converter converter : converters){  
        if(converter.accepts(clazz)){  
            return converter;  
        }  
    }  
    return null;  
}