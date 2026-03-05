public static final <V>void reverse(V[] arr,int from,int to){
if(from<0||to>=arr.length||from>to) throw new IndexOutOfBoundsException();  
    for(int i=from,j=to-1;i<j;i++,j--) {  
        V temp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = temp;  
    }  
}