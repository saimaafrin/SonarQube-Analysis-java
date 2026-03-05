public static Object quoteIfString(Object obj){
if(obj instanceof String){
        return "\"" + obj.toString() + "\"";
    }else{
        return obj;
    }
}