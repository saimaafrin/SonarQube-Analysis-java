class Generated {
    static String[] toNoNullStringArray(Object[] array){
    if(array==null||array.length==0){
            throw new IllegalArgumentException("The given array is null or empty");
        }
        String[] result=new String[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]==null){
                throw new IllegalArgumentException("The given array contains null element");
            }
            result[i]=array[i].toString();
        }
        return result;
    }
}
