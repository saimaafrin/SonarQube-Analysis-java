class Generated {
    @Override public void accept(final METRICS data){
    //data.id is unique
        final int index = find(data.id);
        if(index == -1){
            buffer.add(data);
        }else{
            final METRICS oldData = buffer.get(index);
            final METRICS newData = combine(oldData, data);
            if(newData != null){
                buffer.set(index, newData);
            }else{
                buffer.remove(index);
            }
        }
    }
}
