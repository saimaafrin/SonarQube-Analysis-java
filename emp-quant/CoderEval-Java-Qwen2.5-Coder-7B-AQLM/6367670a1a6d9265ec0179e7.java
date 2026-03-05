class Generated {
    public Converter lookup(final Class<?> clazz){
    for(final Converter converter : converters){
            if(converter.canConvert(clazz)){
                return converter;
            }
        }
        return null;
    }
}
