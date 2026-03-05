class Generated {
    public static <T>List<T> asList(T[] a){
    if(a==null) return Collections.emptyList();
        return Arrays.asList(a);
    }
}
