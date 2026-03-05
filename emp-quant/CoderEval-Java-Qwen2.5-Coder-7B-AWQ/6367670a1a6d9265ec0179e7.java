class Generated {
    public Converter lookup(final Class<?> clazz){
    for(Converter c : converters){
            if(c.supports(clazz)){
                return c;
            }
        }
        return null;
    }
}
