class Generated {
    public static Object quoteIfString(Object obj){
    if(obj instanceof String){
            return "\"" + obj.toString() + "\"";
        }
        return obj;
    }
}
