class Generated {
    @Override protected Object convertToType(final Class<?> type,final Object value) throws Exception {
    if(value==null) return null; if(value instanceof String) { final String str=(String)value; if(str.length()==0) return type==null?null:type.newInstance(); return str.charAt(0); } return super.convertToType(type,value); }
}
