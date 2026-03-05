@SuppressWarnings("unchecked") public static Supplier<String> createStringSupplier(int start){
return () -> {
        int i = start++;
        return String.valueOf(i);
    };
}