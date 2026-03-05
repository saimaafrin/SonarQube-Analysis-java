@Override protected Object convertToType(final Class<?> type,final Object value) throws Exception {
if (value == null) {
		return null;
	}
	if (value instanceof String) {
		final String string = (String) value;
		if (string.length() == 0) {
			return defaultValue;
		}
		return string.charAt(0);
	}
	throw new Exception("Cannot convert " + value.getClass().getName() + " to " + type.getName());
}