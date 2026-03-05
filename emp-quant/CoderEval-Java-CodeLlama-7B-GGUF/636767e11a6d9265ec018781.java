@Override public void accept(final METRICS data){
if(data==null)return;
if(this.buffer.containsKey(data.getId())){
final METRICS existing=this.buffer.get(data.getId());
if(existing.combine(data)){
this.buffer.remove(data.getId());
}
}else{
this.buffer.put(data.getId(),data);
}
}