class Generated {
    @Override public int compare(Double o1,Double o2){
    if(o1==o2)return 0;
    	if(o1==null)return -1;
    	if(o2==null)return 1;
    	double d=o1-o2;
    	if(d>epsilon)return Double.compare(d,o2);
    	return 0;
    }
}
