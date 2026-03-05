static void register(Object value){
if(value != null){
        registry.put(value.getClass(), value);
    }
}