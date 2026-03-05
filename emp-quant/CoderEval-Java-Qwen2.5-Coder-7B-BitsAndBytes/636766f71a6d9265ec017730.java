class Generated {
    static String[] toNoNullStringArray(Collection<?> collection){
    if (collection == null) {
            return EMPTY_STRING_ARRAY;
        } else {
            String[] result = new String[collection.size()];
            int i = 0;
            for (Object obj : collection) {
                result[i++] = obj.toString();
            }
            return result;
        }
    }
}
