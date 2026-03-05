class Generated {
    @Override public void accept(final METRICS data){
    if(data.getId() == null){
            return;
        }
        if(buffer.containsKey(data.getId())){
            final METRICS existing = buffer.get(data.getId());
            if(existing.getTimestamp() == data.getTimestamp()){
                return;
            }
            final METRICS combined = combine(existing, data);
            if(combined == null){
                buffer.remove(data.getId());
            }else{
                buffer.put(data.getId(), combined);
            }
        }else{
            buffer.put(data.getId(), data);
        }
    }
}
