class Generated {
    public static final <V>void reverse(V[] arr,int from,int to){
    if(from<0||to<0||from>to||from>=arr.length||to>=arr.length)
    		throw new IndexOutOfBoundsException();
    	for(int i=from,j=to;i<j;i++,j--){
    		V temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    	}
    }
}
