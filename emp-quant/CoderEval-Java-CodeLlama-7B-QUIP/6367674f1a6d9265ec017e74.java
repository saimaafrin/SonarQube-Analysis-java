class Generated {
    public String toString(){
    StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < vs.length; i++){
    		if(i == 0) sb.append(vs[i]);
    		else sb.append(", ").append(vs[i]);
    	}
    	return sb.toString();
    }
}
