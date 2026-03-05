public static <T>List<T> asList(T[] a){
if(a == null) return new ArrayList<>();
    return Arrays.asList(a);
}