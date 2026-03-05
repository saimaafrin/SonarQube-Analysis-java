static String[] toNoNullStringArray(Collection<?> collection){
if(collection == null){
        return EMPTY_STRING_ARRAY;
    }
    return collection.toArray(new String[0]);
}