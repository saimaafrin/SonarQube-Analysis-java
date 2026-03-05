class Generated {
    static String[] toNoNullStringArray(Object[] array){
    if(array==null){
            throw new IllegalArgumentException("The array must not be null");
        }
        if(array.length==0){
            throw new IllegalArgumentException("The array must not be empty");
        }
        String[] result=new String[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]==null){
                throw new IllegalArgumentException("The element of the array must not be null");
            }
            result[i]=array[i].toString();
        }
        return result;
    }
}
