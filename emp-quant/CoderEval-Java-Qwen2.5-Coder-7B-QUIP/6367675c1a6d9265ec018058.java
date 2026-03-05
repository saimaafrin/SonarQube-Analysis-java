@SuppressWarnings("unchecked") public static Supplier<String> createStringSupplier(int start){
return () -> String.valueOf(start++); 
}