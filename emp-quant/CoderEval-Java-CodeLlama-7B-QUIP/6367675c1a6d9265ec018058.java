class Generated {
    @SuppressWarnings("unchecked") public static Supplier<String> createStringSupplier(int start){
    return () -> {
            return String.valueOf(start++);
        };
    }
}
