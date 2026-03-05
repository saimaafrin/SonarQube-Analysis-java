static String[] toNoNullStringArray(Collection<?> collection){
if (collection == null) {
        return EMPTY_STRING_ARRAY;
    } else {
        String[] array = new String[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            array[i++] = obj.toString();
        }
        return array;
    }
}