class Generated {
    public void abbreviate(final int nameStart,final StringBuffer buf){
    int count=0;
        int index=nameStart;
        while(index<buf.length()){
            if(buf.charAt(index)=='.'){
                count++;
                if(count==this.count){
                    break;
                }
                index++;
            }
            else{
                index++;
            }
        }
        buf.delete(nameStart,index);
    }
}
