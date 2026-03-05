public static final <V>void reverse(V[] arr,int from,int to){
if (from < 0 || to >= arr.length || from > to) {  
        throw new IllegalArgumentException("Invalid range");  
    }  
    for (int i = from; i < (from + to) / 2; i++) {  
        V temp = arr[i];  
        arr[i] = arr[to - i + from];  
        arr[to - i + from] = temp;  
    }  
}