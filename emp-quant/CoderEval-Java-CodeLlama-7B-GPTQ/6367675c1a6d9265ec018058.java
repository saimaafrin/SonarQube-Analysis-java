class Generated {
    @SuppressWarnings("unchecked") public static Supplier<String> createStringSupplier(int start){
    return new Supplier<String>(){
            private int count = start;
            public String get(){
                return String.valueOf(count++);
            }
        };
    }
}
