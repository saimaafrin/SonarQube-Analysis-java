static String[] toNoNullStringArray(Collection<?> collection){
if(collection == null){
        return EMPTY_STRING_ARRAY;
    }
    return collection.stream().map(Object::toString).toArray(String[]::new);
}