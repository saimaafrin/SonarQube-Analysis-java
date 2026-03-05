class Generated {
    public static final <V>void reverse(V[] arr,int from,int to){
    int start=from;
    	int end=to;
    	if(start<0){
    		start=0;
    	}
    	if(end<0){
    		end=arr.length-1;
    	}
    	if(start>end){
    		int temp=start;
    		start=end;
    		end=temp;
    	}
    	for(int i=start;i<end;i++){
    		V temp=arr[i];
    		arr[i]=arr[i+1];
    		arr[i+1]=temp;
    	}
    }
}
