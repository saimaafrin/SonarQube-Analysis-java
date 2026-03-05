@Override protected Object convertToType(final Class<?> type,final Object value) throws Exception {
if (value == null) {
        return null;
    }
    if (value instanceof String) {
        final String str = (String) value;
        if (str.length() == 0) {
            return defaultValue;
        }
        return str.charAt(0);
    }
    return value;
}