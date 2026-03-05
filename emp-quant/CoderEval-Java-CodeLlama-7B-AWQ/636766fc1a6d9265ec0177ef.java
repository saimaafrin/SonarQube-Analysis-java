class Generated {
    static String[] toNoNullStringArray(Object[] array){
    if (array == null) {
            return null;
        }
        List<String> list = new ArrayList<String>();
        for (Object o : array) {
            if (o != null) {
                list.add(o.toString());
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
