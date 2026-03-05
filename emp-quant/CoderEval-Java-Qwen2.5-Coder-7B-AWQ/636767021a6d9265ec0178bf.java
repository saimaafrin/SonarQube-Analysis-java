class Generated {
    @Override protected Object convertToType(final Class<?> type,final Object value) throws Exception {
    if(value instanceof String && ((String)value).length() == 0) return type.newInstance(); else return ((String)value).charAt(0); }
}
