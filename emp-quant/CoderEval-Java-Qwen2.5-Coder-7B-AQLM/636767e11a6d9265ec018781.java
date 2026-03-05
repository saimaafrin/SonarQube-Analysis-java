class Generated {
    @Override public void accept(final METRICS data){
    // data is a METRICS object
        final String id = data.getId();
        final METRICS existing = buffer.get(id);
        if(existing == null){
            buffer.put(id, data);
        }else{
            final METRICS combined = combine(existing, data);
            if(combined != null){
                buffer.put(id, combined);
            }else{
                buffer.remove(id);
            }
        }
    }
}
