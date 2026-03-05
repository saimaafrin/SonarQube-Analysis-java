public Converter lookup(final Class<?> clazz){
for(final Converter converter: converters){
		if(converter.getClass().equals(clazz)){
			return converter;
		}
	}
	return null;
}