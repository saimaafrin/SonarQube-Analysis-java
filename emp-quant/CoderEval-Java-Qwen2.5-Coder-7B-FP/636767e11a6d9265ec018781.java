class Generated {
    @Override public void accept(final METRICS data){
    //data is a Metric object
        final String key = data.getId();
        final METRICS oldData = this.buffer.get(key);
        if(oldData == null){
            this.buffer.put(key, data);
        }else{
            final METRICS newData = oldData.combine(data); //combine two metrics objects
            if(newData.isAbandoned()){
                this.buffer.remove(key);
            }else{
                this.buffer.put(key, newData);
            }
        }
    }
}
