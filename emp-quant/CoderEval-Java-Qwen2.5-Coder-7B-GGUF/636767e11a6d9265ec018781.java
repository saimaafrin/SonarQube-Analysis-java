class Generated {
    @Override public void accept(final METRICS data){
    // data is a METRICS object
        final int id = data.getId();
        if(!buffer.containsKey(id)){
            buffer.put(id, data);
        }else{
            final METRICS existingData = buffer.get(id);
            final METRICS combinedData = combine(existingData, data);
            if(combinedData != null){
                buffer.put(id, combinedData);
            }else{
                buffer.remove(id);
            }
        }
    }
}
