static String[] toNoNullStringArray(Object[] array){
if(array==null){
        return null;
    }
    int len=array.length;
    if(len==0){
        throw new IllegalArgumentException("The data size is zero,cannot convert to array.");
    }
    String[] ret=new String[len];
    int i=0;
    for(Object temp:array){
        if(temp==null){
            throw new IllegalArgumentException("The object at "+i+" position is null,cannot convert to array.");
        }
        ret[i++]=temp.toString();
    }
    return ret;
}