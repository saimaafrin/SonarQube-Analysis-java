static String[] toNoNullStringArray(Object[] array){
if(array==null){
        return null;
    }
    String[] result=new String[array.length];
    int count=0;
    for(Object object:array){
        if(object!=null){
            result[count]=object.toString();
            count++;
        }
    }
    if(count==0){
        throw new RuntimeException("The size of the array is zero.");
    }
    return Arrays.copyOf(result,count);
}