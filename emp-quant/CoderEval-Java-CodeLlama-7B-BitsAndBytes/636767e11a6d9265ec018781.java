class Generated {
    @Override public void accept(final METRICS data){
    if(data.getId() == null){
            return;
        }
        if(data.getId().equals(this.id)){
            if(this.value == null){
                this.value = data.getValue();
            }else{
                this.value = this.value + data.getValue();
            }
            if(this.value == 0){
                this.value = null;
            }
        }else{
            if(this.value != null){
                this.value = this.value + data.getValue();
            }else{
                this.value = data.getValue();
            }
            if(this.value == 0){
                this.value = null;
            }
        }
    }
}
