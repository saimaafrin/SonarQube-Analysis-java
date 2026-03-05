static String[] toNoNullStringArray(Object[] array){
if(array == null){
        return null;
    }
    int len = array.length;
    String[] rst = new String[len];
    for(int i = 0; i < len; i++){
        Object obj = array[i];
        if(obj == null){
            continue;
        }
        if(!(obj instanceof String)){
            throw new IllegalArgumentException("The element " + i + " of the array is not a string.");
        }
        rst[i] = (String)obj;
    }
    return rst;
}