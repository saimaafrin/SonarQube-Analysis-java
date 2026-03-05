@Override protected Object convertToType(final Class<?> type,final Object value) throws Exception {
if(value==null)return null;
	if(value instanceof String) {
		final String str=(String)value;
		if(str.length()==0)return type.getDefaultInstance();
		return type.getType().newInstance(str.split(getSeparator()));
	}
	return type.getType().newInstance(value);
}
}